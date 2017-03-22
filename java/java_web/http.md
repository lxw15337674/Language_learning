### http协议
	浏览器 ------> 服务器  请求(request)
	服务器 ------> 浏览器  响应(response)
	
	tcp/ip协议: 关注的是客户端与服务器之间数据是否传输成功
	http协议: 对浏览器客户端与服务器端之间的数据传输的格式规范.
				是在tcp/ip协议之前封装的一层协议.
#### 查看http协议的工具	
	chrome--> F12--> Network--> Headers
#### http协议内容
	请求（浏览器-》服务器）
		GET /day09/hello HTTP/1.1
		Host: localhost:8080
		User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:35.0) Gecko/20100101 Firefox/35.0
		Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
		Accept-Language: zh-cn,en-us;q=0.8,zh;q=0.5,en;q=0.3
		Accept-Encoding: gzip, deflate
		Connection: keep-alive
	
	响应（服务器-》浏览器）
		HTTP/1.1 200 OK
		Server: Apache-Coyote/1.1
		Content-Length: 24
		Date: Fri, 30 Jan 2015 01:54:57 GMT

		this is hello servlet!!!
### http请求(request)
	-请求行
		GET /day09/hello HTTP/1.1        
	-请求头
		Host: localhost:8080                  
		User-Agent: Mozilla/5.0 (Windows NT 6.1; WOW64; rv:35.0) Gecko/20100101 Firefox/35.0
		Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
		Accept-Language: zh-cn,en-us;q=0.8,zh;q=0.5,en;q=0.3
		Accept-Encoding: gzip, deflate
		Connection: keep-alive
	-一个空行
	
	-（可选）实体内容
		name=eric&password=123456  
		
#### 请求行
	用于描述客户端的请求方式,请求的资源名称,以及使用的HTTP协议版本号.
		例子: GET /day09/hello HTTP/1.1 
		
	http协议版本
		http1.0：当前浏览器客户端与服务器端建立连接之后，只能发送一次请求，一次请求之后连接关闭。
		http1.1：当前浏览器客户端与服务器端建立连接之后，可以在一次连接中发送多次请求。（基本都使用1.1）
	
	请求资源
		URL:统一资源定位符,只能定位互联网资源。是URI的子集。
			http://localhost:8080/day09/testImg.html。
		URI: 统一资源标记符。/day09/hello。用于标记任何资源。可以是本地文件系统，也可以是互联网。
	
	请求方式
		常用的请求方式： GET  和 POST	
			表单提交：
				<form action="提交地址" method="GET/POST">	
					
				<form>
	GET与Post区别
		Get方式提交
			1.地址栏(URI)会跟上参数数据.以?开头,多个参数之间以&分割.
			2.Get提交参数数据有限制,不超过1kb
			3.Get方式不是和提交敏感密码.
			4.注意:浏览器直接访问的请求,默认提交方式是GET方式.
		Post方式提交:
			1.参数不会跟着URI后面,参数而是跟在请求的实体内容中.
			2.POST提交的参数数据没有限制。
			3.POST方式提交敏感数据。
#### 请求头
	由多个key-value对象, 用于描述客户端请求的主机和客户端的一些环境信息.
		Accept: text/html,image/*      -- 浏览器接受的数据类型
		Accept-Charset: ISO-8859-1     -- 浏览器接受的编码格式
		Accept-Encoding: gzip,compress  --浏览器接受的数据压缩格式
		Accept-Language: en-us,zh-       --浏览器接受的语言
		Host: www.it315.org:80          --（必须的）当前请求访问的目标地址（主机:端口）
		If-Modified-Since: Tue, 11 Jul 2000 18:23:51 GMT  --浏览器最后的缓存时间
		Referer: http://www.it315.org/index.jsp      -- 当前请求来自于哪里
		User-Agent: Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0)  --浏览器类型
		Cookie:name=eric                     -- 浏览器保存的cookie信息
		Connection: close/Keep-Alive            -- 浏览器跟服务器连接状态。close: 连接关闭  keep-alive：保存连接。
		Date: Tue, 11 Jul 2000 18:23:51 GMT      -- 请求发出的时间
#### 实体内容	
	只有POST提交的参数会放到实体内容中

#### Http响应(response)
	响应行
		HTTP/1.1 200 OK
	响应头
		Server: Apache-Coyote/1.1
		Content-Length: 24
		Date: Fri, 30 Jan 2015 01:54:57 GMT
	一个空行
	
	实体内容
		this is hello servlet!!!
#### 响应行
	http协议版本
		状态码:服务器处理请求的结果(状态)
			常用的状态:
				200: 表示请求处理完成并完美返回
				302: 表示请求需要进一步细化.重定向
				303: 表示访问的资源找不到 
				500: 表示服务器的资源发送错误.(服务器内部错误).
#### 常见的响应头
	Location: http://www.it315.org/index.jsp   -表示重定向的地址，该头和302的状态码一起使用。
	Server:apache tomcat                 ---表示服务器的类型
	Content-Encoding: gzip                 -- 表示服务器发送给浏览器的数据压缩类型
	Content-Length: 80                    --表示服务器发送给浏览器的数据长度
	Content-Language: zh-cn               --表示服务器支持的语言
	Content-Type: text/html; charset=GB2312   --表示服务器发送给浏览器的数据类型及内容编码
	Last-Modified: Tue, 11 Jul 2000 18:23:51 GMT  --表示服务器资源的最后修改时间
	Refresh: 1;url=http://www.it315.org     --表示定时刷新
	Content-Disposition: attachment; filename=aaa.zip --表示告诉浏览器以下载方式打开资源（下载文件时用到）
	Transfer-Encoding: chunked
	Set-Cookie:SS=Q0=5Lb_nQ; path=/search   --表示服务器发送给浏览器的cookie信息（会话管理用到）
	Expires: -1                           --表示通知浏览器不进行缓存
	Cache-Control: no-cache
	Pragma: no-cache
	Connection: close/Keep-Alive           --表示服务器和浏览器的连接状态。close：关闭连接 keep-alive:保存连接

		
