#### 软件的结构
	C/S(Client Server 客户端-服务器端)结构:即各种应用软件
		特点:
			1.必须下载特定的客户端程序
			2.客户端与服务端都需要升级
		
	B/S(Browser Server 浏览器端-服务器端)结构:即各种网站
		特点:
			1.不需要安装特定的客户端
			2.只需要升级服务端,浏览器不需要升级
### web服务软件
	作用:把本地的资源共享给外部访问.
### tomcat
#### Tomcat目录结构
	|-bin: 存放tomcat的命令。
			catalina.bat 命令：
				startup.bat  -> catalina.bat start	
				shutdown.bat - > catalina.bat stop
	|-conf: 存放tomcat的配置信息。其中server.xml文件是核心的配置文件。
	|-lib：支持tomcat软件运行的jar包。其中还有技术支持包，如servlet，jsp
	|-logs：运行过程的日志信息
	|-temp: 临时目录
	|-webapps： 共享资源目录。web应用目录。（注意不能以单独的文件进行共享）
		|- WebRoot :   web应用的根目录
				|- 静态资源（html+css+js+image+vedio）
				|- WEB-INF ： 固定写法。
					|-classes： （可选）固定写法。存放class字节码文件
					|-lib： （可选）固定写法。存放jar包文件。
					|-web.xml    
					
		注意：
			1）WEB-INF目录里面的资源不能通过浏览器直接访问
			2）如果希望访问到WEB-INF里面的资源，就必须把资源配置到一个叫web.xml的文件中。

	|-work： tomcat的运行目录。jsp运行时产生的临时文件就存放在这里	
	
#### Servlet
	Servlet : 用java语言来编写动态资源的开发技术。
	
	特点：
		1）普通的java类，继承HttpServlet类，覆盖doGet方法
		2）Servlet类只能交给tomcat服务器运行！！！！（开发者自己不能运行！！！）
	
	eclipse部署步骤：
		1）创建web project （javaweb工程）
		2）在WebRoot下建立静态资源文件，
		3）在src下建立动态资源文件
			  3.1 new -> Servlet( servlet的代码生成器)
			  3.2 写pacakge  -> class名 -> 修改mapping  url 
		4）关联tomcat服务器
			4.1 window-> Preferences - > MyEcplise -> servers -> Tomcat 6.x (注意一定要enable)
		5）部署web project应用。（拷贝web应用到tomcat的webapps目录下）
		6）启动tomcat服务器
		7）访问servlet			
				http://localhost:8081/day08_web/hello
	
	idea部署步骤
		1.新建一个project 或 Module,类型选择web Application
		2.在src中new一个servlet类,编写代码
		3.对WEB_INF中的web.xml配置文件,增加<servlet-mapping>映射
		4.启动tomcat,进行访问
	
	流程:
		1.tomcat服务器接收到浏览器发送的请求数据,然后封装到HttpServetRequest对象
			HttpServletRequest对象作用是用于获取请求数据。
				核心的API：
					请求行： 
						request.getMethod();   请求方式
						request.getRequetURI()   / request.getRequetURL()   请求资源
						request.getProtocol()   请求http协议版本
					
					请求头：
						request.getHeader("名称")   根据请求头获取请求值
						request.getHeaderNames()    获取所有的请求头名称

					实体内容:
						request.getInputStream()   获取实体内容数据

		2.tomcat服务器调用doGet方法,然后把request对象传入到servlet中
		3.通过response对象改变响应信息
				HttpServletResponse对象修改响应信息：
					响应行： 
							response.setStatus()  设置状态码
					响应头： 
							response.setHeader("name","value")  设置响应头
					实体内容：
							response.getWriter().writer();   发送字符实体内容
							response.getOutputStream().writer()  发送字节实体内容 
		4.tomcat服务器把response对象的内容转换成响应格式内容,再发送给浏览器解析
### 获取传递的请求参数
	GET方式： 参数放在URI后面
	POST方式： 参数放在实体内容中
		获取GET方式参数：
				request.getQueryString();
		获取POST方式参数：
				request.getInputStream();

		问题：但是以上两种不通用，而且获取到的参数还需要进一步地解析。
		所以可以使用统一方便的获取参数的方式：
			核心的API：
			request.getParameter("参数名");  根据参数名获取参数值（注意，只能获取一个值的参数）
			request.getParameterValue("参数名“)；根据参数名获取参数值（可以获取多个值的参数）

			request.getParameterNames();   获取所有参数名称列表 
#### 请求参数编码问题
	修改POST方式参数编码：
		全局设置编码:
			在调用request.getParameter()前设置查询的码表:request.setCharacterEncoding("utf-8");
	修改GET方式参数编码：
		手动解码：String name = new String(name.getBytes("iso-8859-1"),"utf-8");
#### Servlet的映射路径
	精确匹配		/first				http://localhost:8080/day10/first
					/itcast/demo1		http://localhost:8080/day10/itcast/demo1
	模糊匹配		/*					http://localhost:8080/day10/*
					/itcast/*           http://localhost:8080/day10/itcast/任意路径
					*.后缀名			http://localhost:8080/day10/任意路径.后缀名
	
	注意：
		1）url-pattern要么以 / 开头，要么以*开头。  例如， itcast是非法路径。
		2）不能同时使用两种模糊匹配，例如 /itcast/*.do是非法路径
		3）当有输入的URL有多个servlet同时被匹配的情况下：
				3.1 精确匹配优先。（长的最像优先被匹配）
				3.2 以后缀名结尾的模糊url-pattern优先级最低！！！
#### servlet缺省路径
	servlet的缺省路径是在tomcat服务器内置的一个路径.
	该路径对应的是一个DefaultServlet(缺省servlet).用于解析web应用的静态资源文件.
	
	问题： URL输入http://localhost:8080/day10/index.html 如何读取文件？？？？

		1）到当前day10应用下的web.xml文件查找是否有匹配的url-pattern。
		2）如果没有匹配的url-pattern，则交给tomcat的内置的DefaultServlet处理
		3）DefaultServlet程序到day10应用的根目录下查找是存在一个名称为index.html的静态文件。
		4）如果找到该文件，则读取该文件内容，返回给浏览器。
		5）如果找不到该文件，则返回404错误页面。
			
			结论： 先找动态资源，再找静态资源。
#### Servlet生命周期
	




	
	


