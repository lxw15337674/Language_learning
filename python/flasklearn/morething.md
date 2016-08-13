#### **上下文全局变量: **
| 变量名      | 上下文          | 说明  |
|:---------- :|:---------:|: ---------------------------------------------------------------------------:|
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
		|StringField 文本字段
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
		
###第四章
####最常用的SQLAlchemy列类型
| 类型名      | python类型         | 说明  |
|: -----------: |:-------------:|: -------------------------------------------------:|
|Integer |int |普通整数，一般是 32 位
|SmallInteger |int| 取值范围小的整数，一般是 16 位|
|BigInteger |int 或 long| 不限制精度的整数
|Float |float| 浮点数
|Numeric |decimal.Decimal| 定点数
|String| str| 变长字符串
|Text |str |变长字符串，对较长或不限长度的字符串做了优化
|Unicode |unicode| 变长 Unicode 字符串
|UnicodeText |unicode| 变长 Unicode 字符串，对较长或不限长度的字符串做了优化
|Boolean |bool| 布尔值
|Date |datetime.date |日期
|Time |datetime.time| 时间
|DateTime |datetime.datetime| 日期和时间
|Interval| datetime.timedelta| 时间间隔
|Enum |str |一组字符串
|PickleType |任何 Python 对象| 自动使用 Pickle 序列化
|LargeBinary |str| 二进制文件

####最常使用的SQLAlchemy列选项
		primary_key 如果设为 True，这列就是表的主键
		unique 如果设为 True，这列不允许出现重复的值
		index 如果设为 True，为这列创建索引，提升查询效率
		nullable 如果设为 True，这列允许使用空值；如果设为 False，这列不允许使用空值
		default 为这列定义默认值

####最常使用的SQLAlchemy关系选项
		backref 在关系的另一个模型中添加反向引用
		primaryjoin 明确指定两个模型之间使用的联结条件。只在模棱两可的关系中需要指定
		lazy	指定如何加载相关记录。可选值有 select（首次访问时按需加载）、 immediate（源对象加
				载后就加载）、 joined（加载记录，但使用联结）、 subquery（立即加载，但使用子查询），
				noload（永不加载）和 dynamic（不加载记录，但提供加载记录的查询）
		uselist 如果设为 Fales，不使用列表，而使用标量值
		order_by 指定关系中记录的排序方式
		secondary 指定多对多关系中关系表的名字
		secondaryjoin SQLAlchemy 无法自行决定时，指定多对多关系中的二级联结条件

####常用的SQLAlchemy查询过滤器
		filter() 把过滤器添加到原查询上，返回一个新查询
		filter_by() 把等值过滤器添加到原查询上，返回一个新查询
		limit() 使用指定的值限制原查询返回的结果数量，返回一个新查询
		offset() 偏移原查询返回的结果，返回一个新查询
		order_by() 根据指定条件对原查询结果进行排序，返回一个新查询
		group_by() 根据指定条件对原查询结果进行分组，返回一个新查询

				
