####软件的结构
	C/S(Client Server 客户端-服务器端)结构:即各种应用软件
		特点:
			1.必须下载特定的客户端程序
			2.客户端与服务端都需要升级
		
	B/S(Browser Server 浏览器端-服务器端)结构:即各种网站
		特点:
			1.不需要安装特定的客户端
			2.只需要升级服务端,浏览器不需要升级
###web服务软件
	作用:把本地的资源共享给外部访问.
###tomcat
####URL
	全名叫统一资源定位符，用于定位互联网的资源。
		问题： http://localhost:8081/myweb/test.html  看到文件？
		
		http://     协议。http协议。
		localhost    域名。为了找到IP地址。
						本地域名： localhost
						外部域名：www.baidu.com
		8081       端口。软件监听的
					8080： tomcat默认的端口
					3306：mysql数据库的端口
					1521： orace数据库的端口。
		/myweb:   web应用的名称。默认情况下，在webapps目录下找
		/test.html  ： 资源名称。
####Tomcat目录结构
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

####动态资源开发技术
	Servlet : 用java语言来编写动态资源的开发技术。
	
	Servlet特点：
		1）普通的java类，继承HttpServlet类，覆盖doGet方法
		2）Servlet类只能交给tomcat服务器运行！！！！（开发者自己不能运行！！！）
	
	eclipse编写步骤：
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




	
	