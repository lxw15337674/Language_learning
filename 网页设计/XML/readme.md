##XML
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
