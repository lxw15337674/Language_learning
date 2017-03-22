## Html<代码day02>
	在一个网页中负责页面的结构
	html的注释:<!-- -->
	标签的类型:
		1.有开始标签与结束标签. <p> </p>	需要补网页的数据内容封装到标签中.
		2.开始标签与结束标签都是在一个标签体内的 <hr/> 功能单一不需要封装数据到标签中
### 头信息<head>
	1.可以设置网页的标题
		<title>xxx</title>
    2.设置编码解释html页面
		<meta charset="utf-8">
	3.设置关键字(从而被搜索引擎搜到)
		<meta name = "keywords" content="实习,实习生,找实习">
### 网页内容<body>
#### 常用标签
	<h1>~<h6> 表示是一个标题
	<p>   段落标签
    <hr/>  水平线标签	添加水平横线
 	<br/>  换行标签
    <sub>  下标
    <sup>  上标
    <pre>  原样标签： 原样标签会保留空格和换行符。
    <ol> <li> 有序的列表标签、			<ol>在网页中显示的默认样式一般为：每项<li>前都自带一个序号，序号默认从1开始
    <ul> <li> 无序的列表标签。				ul-li在网页中显示的默认样式一般为：每项li前都自带一个圆点.
    项目列表标签(dl dt dd)
    行内标签(span)     
	块标签<div>    div标签的内容会独立占一行。
#### 实体标签	
	因为> < 等一些符号在html页面中是有着特殊含义，这些字符如果需要在页面中显示，这时候就应该使用实体标签。
	常用的实体字符: 
		空格      &nbsp;
		小于号    &lt;
		大于号    &gt;
	-----------------------------
		人民币    &yen；
		版权      &copy;
		商标      &reg;
#### 媒体标签
	<embed></embed>  
		hidden ： 设置隐藏插件是否隐藏。
		src ：用于指定音乐的路径
   
   <marquee> 飘动标签
   		direction : 指定飘动的方向
        scrollamount : 指定飘动的速度。
        loop   :指定飘动的次数  "-1"则无限飘动
#### <a>超链接标签
	a标签常用的属性：
		href  : 用于指定链接的资源
		target: 设置打开新资源的方式。默认为_self    _Blank 在独立的窗口上打开新资源   _self 在当前窗口打开新资源 

	file: file协议（文件协议）这种协议主要是用于搜索本地机器的资源文件的。
		格式：
		file:\\\f:\美女\1.jpg    

	a标签的原理：
		1.a标签的href属性值如果是以http开头的，那么浏览器会马上启动http解释器去解释该网址，
		 首先会在本地机器去找一个hosts文件， 
		 如果在hosts文件上该域名没有对应的主机，那么浏览器就去到对应的dns服务器去寻找该域名对应的主机号。
		 如果找到了对应的主机，那么该请求就会发给对应的主机。

		2.如果a标签的href属性值没有以任何协议开头，那么浏览就会启动file协议解释器去解释该资源路径。

		3.如果a标签的href属性值并不是以http开始，而且其他 的一些协议，那么这时候浏览器就回去到我们本地的注册
		表中去查找是否有处理这种协议 的应用程序，如果有，那么马上启动该应用程序处理该协议。
			例如:迅雷的协议：thunder

	超链接标签的作用：
		1. 可以用于链接资源。
		2. 锚点点位.  
			1. 首先编写一个锚点  锚点的格式： <a name="锚点名字"> 数据</a>
			2. 使用a标签 的herf属性连接到锚点出。  href=”#锚点的名字“    

#### <img>图片标签
	img标签常用的属性:
		src=	图片地址
		width： 设置图片宽度
		height  设置图片高度    
		alt    	如果图片资源无法找到，那么就显示对应的文字对图片进行说明。
		title 	提示文本
#### <table>表格标签
	表格使用到的标签：
		<table> 表格
		<tr>    行
		<td>    单元格
		<th>     表头   默认的样式是居中，加粗。
		<caption>  表格的标题
		
	表格常用的属性：
		border  设置表格的边框 
		width : 设置表格的宽度
		height: 设置表格的高度的。
		colspan: 设置单元格占据指定的列数。
		rowspan : 设置单元格占据指定的行数。	
#### 框架标签
	frameSet: 一个frameSet可以被切割多份,只能按照行或者列切割.
	frame:	不能被切割的.freame是位于frameSet中
		注意:freameSet标签不能用于body标签内
#### <form>表单标签
	表单标签的作用是用于提交数据给服务器的。
	<form>常用的属性：
		action: 该属性是用于指定提交数据的地址。
		method： 指定表单的提交方式。
				get : 默认使用的提交方式。  提交的数据会显示在地址栏上。
				post ：  提交的数据不会显示在地址栏上。
	注意：
		表单项的数据如果需要提交到服务器上面，那么表单项必须要有name的属性值。
		
	格式:	
		<form   method="传送方式"   action="服务器文件">
			1.input type: 
					当type="text"时，输入框为文本输入框;当type="password"时, 输入框为密码输入框。
							<form>
								<input type="text/password" name="名称" value="文本" />
							</form>
					当 type="radio" 时，控件为单选框,当 type="checkbox" 时，控件为复选框:
						value：提交数据到服务器的值（后台程序PHP使用）
						checked：当设置 checked="checked" 时，该选项被默认选中
							<input   type="radio/checkbox"   value="值"    name="名称"   checked="checked"/>
					当type = "submit",使用提交按钮,提交数据:
						此处value表示按钮上显示的文字
					当type="reset",使用重置按钮,重置输入框
						此处value表示按钮上显示的文字
			2、name：为文本框命名，以备后台程序ASP 、PHP使用。
			3、value：为文本输入框设置默认值。(一般起到提示作用)
							<form>
								姓名：
								<input type="text" name="myName">
								<br/>
								密码：
								<input type="password" name="pass">
							</form>
		<textarea>标签，支持多行文本输入
				<textarea  rows="行数" cols="列数">文本</textarea>
				1、<textarea>标签是成对出现的，以<textarea>开始，以</textarea>结束。
				2、cols ：多行输入域的列数。
				3、rows ：多行输入域的行数。
				4、在<textarea></textarea>标签之间可以输入默认值。
		<select>标签,使用下拉列表框
				<option value="向服务器提交的值">显示的值</option>
				设置selected="selected"属性，则该选项就被默认选中。
				在<select>标签中设置multiple="multiple"属性，就可以实现多选功能
		<label>标签就是你点击文字也能在按钮或者选择框里获取焦点
				<label for="控件id名称">	
		
		
		
	
