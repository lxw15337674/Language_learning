####����Ľṹ
	C/S(Client Server �ͻ���-��������)�ṹ:������Ӧ�����
		�ص�:
			1.���������ض��Ŀͻ��˳���
			2.�ͻ��������˶���Ҫ����
		
	B/S(Browser Server �������-��������)�ṹ:��������վ
		�ص�:
			1.����Ҫ��װ�ض��Ŀͻ���
			2.ֻ��Ҫ���������,���������Ҫ����
###web�������
	����:�ѱ��ص���Դ������ⲿ����.
###tomcat
####URL
	ȫ����ͳһ��Դ��λ�������ڶ�λ����������Դ��
		���⣺ http://localhost:8081/myweb/test.html  �����ļ���
		
		http://     Э�顣httpЭ�顣
		localhost    ������Ϊ���ҵ�IP��ַ��
						���������� localhost
						�ⲿ������www.baidu.com
		8081       �˿ڡ����������
					8080�� tomcatĬ�ϵĶ˿�
					3306��mysql���ݿ�Ķ˿�
					1521�� orace���ݿ�Ķ˿ڡ�
		/myweb:   webӦ�õ����ơ�Ĭ������£���webappsĿ¼����
		/test.html  �� ��Դ���ơ�
####TomcatĿ¼�ṹ
	|-bin: ���tomcat�����
			catalina.bat ���
				startup.bat  -> catalina.bat start	
				shutdown.bat - > catalina.bat stop
	|-conf: ���tomcat��������Ϣ������server.xml�ļ��Ǻ��ĵ������ļ���
	|-lib��֧��tomcat������е�jar�������л��м���֧�ְ�����servlet��jsp
	|-logs�����й��̵���־��Ϣ
	|-temp: ��ʱĿ¼
	|-webapps�� ������ԴĿ¼��webӦ��Ŀ¼����ע�ⲻ���Ե������ļ����й���
		|- WebRoot :   webӦ�õĸ�Ŀ¼
				|- ��̬��Դ��html+css+js+image+vedio��
				|- WEB-INF �� �̶�д����
					|-classes�� ����ѡ���̶�д�������class�ֽ����ļ�
					|-lib�� ����ѡ���̶�д�������jar���ļ���
					|-web.xml    
					
		ע�⣺
			1��WEB-INFĿ¼�������Դ����ͨ�������ֱ�ӷ���
			2�����ϣ�����ʵ�WEB-INF�������Դ���ͱ������Դ���õ�һ����web.xml���ļ��С�

	|-work�� tomcat������Ŀ¼��jsp����ʱ��������ʱ�ļ��ʹ��������

####��̬��Դ��������
	Servlet : ��java��������д��̬��Դ�Ŀ���������
	
	Servlet�ص㣺
		1����ͨ��java�࣬�̳�HttpServlet�࣬����doGet����
		2��Servlet��ֻ�ܽ���tomcat���������У����������������Լ��������У�������
	
	eclipse��д���裺
		1������web project ��javaweb���̣�
		2����WebRoot�½�����̬��Դ�ļ���
		3����src�½�����̬��Դ�ļ�
			  3.1 new -> Servlet( servlet�Ĵ���������)
			  3.2 дpacakge  -> class�� -> �޸�mapping  url 
		4������tomcat������
			4.1 window-> Preferences - > MyEcplise -> servers -> Tomcat 6.x (ע��һ��Ҫenable)

		5������web projectӦ�á�������webӦ�õ�tomcat��webappsĿ¼�£�
		6������tomcat������
		7������servlet			
				http://localhost:8081/day08_web/hello
	
	idea������
		1.�½�һ��project �� Module,����ѡ��web Application
		2.��src��newһ��servlet��,��д����
		3.��WEB_INF�е�web.xml�����ļ�,����<servlet-mapping>ӳ��
		4.����tomcat,���з���




	
	