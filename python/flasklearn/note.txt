#### **上下文全局变量: **
| 变量名      | 上下文          | 说明  |
| ------------- |:-------------:| -----:|
		| urrent_app     |程序上下文 |当前激活程序的程序实例 |
		| .g  	     | 程序上下文     |   处理请求时用作临时存储的对象.每次请求都会重设这个变量 |
		| request | 请求上下文      |    请求对象,封装了客户端发出的HTTP请求中的内容|
		| session |请求上下文|用户会话,用于存储请求之间需要'记住'的值的词典

####  **4种请求钩子,使用修饰器实现用以实现注册通用函数: **
		before_first_request：注册一个函数，在处理第一个请求之前运行。
		before_request：注册一个函数，在每次请求之前运行。
		after_request：注册一个函数，如果没有未处理的异常抛出，在每次请求之后运行。
		teardown_request：注册一个函数，即使有未处理的异常抛出，也在每次请求之后运行。

####  **jinja2变量过滤器: **
		safe 渲染值时不转义
		capitalize 把值的首字母转换成大写，其他字母转换成小写
		lower 把值转换成小写形式
		upper 把值转换成大写形式
		title 把值中每个单词的首字母都转换成大写
		trim 把值的首尾空格去掉
		striptags 渲染之前把值中所有的 HTML 标签都删掉

####  **Flask-Bootstrap基模板中定义的块:**
		html_attribs <html> 标签的属性
		html <html> 标签中的内容
		head <head> 标签中的内容
		title <title> 标签中的内容
		metas 一组 <meta> 标签
		styles 层叠样式表定义
		body_attribs <body> 标签的属性
		body <body> 标签中的内容
		navbar	用户定义的导航条
		content 用户定义的页面内容
		scripts 文档底部的 JavaScript 声明

####404， 客户端请求未知页面或路由时显示； 500，有未处理的异常时显示。

###第三章
####WTForms 支持的 HTML 标准字段:
		StringField 文本字段
		TextAreaField 多行文本字段
		PasswordField 密码文本字段
		HiddenField 隐藏文本字段
		DateField 文本字段，值为 datetime.date 格式
		DateTimeField 文本字段，值为 datetime.datetime 格式
		IntegerField 文本字段，值为整数
		DecimalField 文本字段，值为 decimal.Decimal
		FloatField 文本字段，值为浮点数
		BooleanField 复选框，值为 True 和 False
		RadioField 一组单选框
		SelectField 下拉列表
		SelectMultipleField 下拉列表，可选择多个值
		FileField 文件上传字段
		SubmitField 表单提交按钮
		FormField 把表单作为字段嵌入另一个表单
		FieldList 一组指定类型的字段
####WTForms验证函数
		Email 验证电子邮件地址
		EqualTo 比较两个字段的值；常用于要求输入两次密码进行确认的情况
		IPAddress 验证 IPv4 网络地址
		Length 验证输入字符串的长度
		NumberRange 验证输入的值在数字范围内
		Optional 无输入值时跳过其他验证函数
		Required 确保字段中有数据
		Regexp 使用正则表达式验证输入值
		URL 验证 URL
		AnyOf 确保输入值在可选值列表中
		NoneOf 确保输入值不在可选值列表中