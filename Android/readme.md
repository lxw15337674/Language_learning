####��������:
	1.onCreate
	2.onStart
	3.onResume
	4.onPause
	5.onStop
	6.onDestory
####Bundle ����aty֮�䴫�ݱ���,�����ַ�ʽ
		����:
			Bundle b = new Bundle()
			b.putString("name","lixiwang");
			b.putInt("age",2);
		ʹ��:
			a = data.getString("name")
			
		1.  ����intent i��
				i.putExtras(b);
			��ȡ
				Intent i = getIntent();
				Bundle data = i.getExtras();

		2   ����intent i��
				i.putExtra("data",b);
			��ȡ
				Bundle data = i.getBundleExtra("data");