##XML
	作用:
		1.作为软件配置文件
		2.作为小型的数据库
	区分大小写
####CDATA块
	作用:可以让一些需要进行包含的特殊字符的内容统一进行原样输出.
####XML解析方式(原理不同)
	DOM解析
	SAX解析
####解析工具
	DOM解析:
		1.JAXP
		2.JDOM
		3.DOM4J
			三大框架(默认读取xml的工具就是DOM4J)
	SAX解析:
		1.sax解析工具
####DOM4J
	读取:
		节点
			标签节点
			属性节点
			文本节点
	使用步骤:
		1.导入jar包
		2.编写核心代码
			//创建一个xml解析器对象
			SAXReader reader = new SAXReader();
			//读取xml文档,返回document对象
			Document doc = reader.read(new File("src/day06/xml/lol.xml"));
	主要方法:
		节点：
			Iterator  Element.nodeIterator();  //获取当前标签节点下的所有子节点

		标签：
			  Element  Document.getRootElement();  //获取xml文档的根标签		
			 Element   ELement.element("标签名") //指定名称的第一个子标签
			  Iterator<Element> Element.elementIterator("标签名");// 指定名称的所有子标签
				List<Element>	 Element.elements(); //获取所有子标签
				
		属性：
			String   Element.attributeValue("属性名") //获取指定名称的属性值
			 Attribute    Element.attribute("属性名")；//获取指定名称的属性对象	
					Attribute.getName()  //获取属性名称
					Attibute.getValue()  //获取属性值
			List<Attribute>	 Element.attributes();  //获取所有属性对象
			Iterator<Attribute>		Element.attibuteIterator(); //获取所有属性对象
		文本：
			Element.getText();  //获取当前标签的文本
			Element.elementText("标签名") //获取当前标签的指定名称的子标签的文本内容
			
			
	修改xml文档
		写出内容到xml文档
				XMLWriter writer = new XMLWriter(OutputStream, OutputForamt)
				wirter.write(Document);
		
		输出XML的格式:
			OutputFormat.createCompactFormat();//compact 紧凑的 Format 格式  去除空格换行的输出格式.项目上线的时候
			OutputFormat.createPrettyPrint();//漂亮的格式	有空格和换行的输出格式.开发调试的时候
		指定生成的xml文档编码(用于避免中文乱码问题)
			format.setEncoding("utf-8")
			
		修改xml文档的API
			增加： 
				DocumentHelper.createDocument()  增加文档
				addElement("名称")  增加标签
				addAttribute("名称"，“值”)  增加属性
			修改：
				Attribute.setValue("值")  修改属性值
				Element.addAtribute("同名的属性名","值")  修改同名的属性值
				Element.setText("内容")  修改文本内容
			删除
				Element.detach();  删除标签  
				Attribute.detach();  删除属性
####xPath
	作用:
		主要是用于快速获取所需的节点对象
	在dom4j下使用xpath
		步骤:
			1.导入jaxen包
			2.使用xpath方法
				List<Node>  selectNodes("xpath表达式");   查询多个节点对象
				Node       selectSingleNode("xpath表达式");  查询一个节点对象
				
	语法
		/      绝对路径      表示从xml的根位置开始或子元素（一个层次结构）
		//     相对路径       表示不分任何层次结构的选择元素。
		*      通配符         表示匹配所有元素
		[]      条件           表示选择什么条件下的元素
		@     属性            表示选择属性节点
		and     关系          表示条件的与关系（等价于&&）
		text()    文本           表示选择文本内容
