###XML约束
	规范XML文件数据内容格式的编写规则.
####xml约束技术
	DTD约束:语法简单,功能简单
	Schema约束:语法复杂,功能强大.
###DTD约束	
####导入dtd方式
	内部导入				
		<!DOCTYPE note [
		  <!ELEMENT note (to,from,heading,body)>
		  <!ELEMENT to      (#PCDATA)>
		  <!ELEMENT from    (#PCDATA)>
		  <!ELEMENT heading (#PCDATA)>
		  <!ELEMENT body    (#PCDATA)>
		]>
	外部导入
		本地文件系统：						
			<!DOCTYPE note SYSTEM "note.dtd">
		公共的外部导入：		
			<!DOCTYPE 根元素 PUBLIC "http://gz.itcast.cn/itcast.dtd">
####DTD语法
	约束标签
		<!ELEMENT 元素名称 类别>  或 <!ELEMENT 元素名称 (元素内容)>

	类别：
		空标签： EMPTY。 表示元素一定是空元素。
		普通字符串： (#PCDATA)。表示元素的内容一定是普通字符串（不能含有子标签）。
		任何内容： ANY。表示元素的内容可以是任意内容（包括子标签） 

	(元素内容):
		顺序问题：
			<!ELEMENT 元素名称 (子元素名称 1,子元素名称 2,.....)>： 按顺序出现子标签

		次数问题：
				标签   ：  必须且只出现1次。
				标签+  ： 至少出现1次
				标签*   ： 0或n次。
				标签？  ： 0 或1次。
	约束属性
		<!ATTLIST 元素名称 属性名称 属性类型 默认值>

		默认值：
				#REQUIRED 属性值是必需的 
				#IMPLIED   属性不是必需的 
				#FIXED value 属性不是必须的，但属性值是固定的

		属性类型：控制属性值的
			CDATA ：表示普通字符串 
			(en1|en2|..)： 表示一定是任选其中的一个值
			ID：表示在一个xml文档中该属性值必须唯一。值不能以数字开头
####Schema约束
	名称空间:告诉xml文档的元素被哪个文档约束
	