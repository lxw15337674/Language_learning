#### **������ȫ�ֱ���: **
| ������      | ������          | ˵��  |
| ------------- |:-------------:| -----:|
		| urrent_app     |���������� |��ǰ�������ĳ���ʵ�� |
		| .g  	     | ����������     |   ��������ʱ������ʱ�洢�Ķ���.ÿ�����󶼻������������ |
		| request | ����������      |    �������,��װ�˿ͻ��˷�����HTTP�����е�����|
		| session |����������|�û��Ự,���ڴ洢����֮����Ҫ'��ס'��ֵ�Ĵʵ�

####  **4��������,ʹ��������ʵ������ʵ��ע��ͨ�ú���: **
		before_first_request��ע��һ���������ڴ����һ������֮ǰ���С�
		before_request��ע��һ����������ÿ������֮ǰ���С�
		after_request��ע��һ�����������û��δ������쳣�׳�����ÿ������֮�����С�
		teardown_request��ע��һ����������ʹ��δ������쳣�׳���Ҳ��ÿ������֮�����С�

####  **jinja2����������: **
		safe ��Ⱦֵʱ��ת��
		capitalize ��ֵ������ĸת���ɴ�д��������ĸת����Сд
		lower ��ֵת����Сд��ʽ
		upper ��ֵת���ɴ�д��ʽ
		title ��ֵ��ÿ�����ʵ�����ĸ��ת���ɴ�д
		trim ��ֵ����β�ո�ȥ��
		striptags ��Ⱦ֮ǰ��ֵ�����е� HTML ��ǩ��ɾ��

####  **Flask-Bootstrap��ģ���ж���Ŀ�:**
		html_attribs <html> ��ǩ������
		html <html> ��ǩ�е�����
		head <head> ��ǩ�е�����
		title <title> ��ǩ�е�����
		metas һ�� <meta> ��ǩ
		styles �����ʽ����
		body_attribs <body> ��ǩ������
		body <body> ��ǩ�е�����
		navbar	�û�����ĵ�����
		content �û������ҳ������
		scripts �ĵ��ײ��� JavaScript ����

####404�� �ͻ�������δ֪ҳ���·��ʱ��ʾ�� 500����δ������쳣ʱ��ʾ��

###������
####WTForms ֧�ֵ� HTML ��׼�ֶ�:
		StringField �ı��ֶ�
		TextAreaField �����ı��ֶ�
		PasswordField �����ı��ֶ�
		HiddenField �����ı��ֶ�
		DateField �ı��ֶΣ�ֵΪ datetime.date ��ʽ
		DateTimeField �ı��ֶΣ�ֵΪ datetime.datetime ��ʽ
		IntegerField �ı��ֶΣ�ֵΪ����
		DecimalField �ı��ֶΣ�ֵΪ decimal.Decimal
		FloatField �ı��ֶΣ�ֵΪ������
		BooleanField ��ѡ��ֵΪ True �� False
		RadioField һ�鵥ѡ��
		SelectField �����б�
		SelectMultipleField �����б���ѡ����ֵ
		FileField �ļ��ϴ��ֶ�
		SubmitField ���ύ��ť
		FormField �ѱ���Ϊ�ֶ�Ƕ����һ����
		FieldList һ��ָ�����͵��ֶ�
####WTForms��֤����
		Email ��֤�����ʼ���ַ
		EqualTo �Ƚ������ֶε�ֵ��������Ҫ�����������������ȷ�ϵ����
		IPAddress ��֤ IPv4 �����ַ
		Length ��֤�����ַ����ĳ���
		NumberRange ��֤�����ֵ�����ַ�Χ��
		Optional ������ֵʱ����������֤����
		Required ȷ���ֶ���������
		Regexp ʹ��������ʽ��֤����ֵ
		URL ��֤ URL
		AnyOf ȷ������ֵ�ڿ�ѡֵ�б���
		NoneOf ȷ������ֵ���ڿ�ѡֵ�б���