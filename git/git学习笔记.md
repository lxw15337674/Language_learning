# Git�ʼ�
---
### 1. ��������Working Directory���Ͱ汾�⣨Repository��
<br>
	
<img src="git.jpeg">
	
**˵����**


* ���������Ǵ����ֿ���ļ����磨learngit�ļ��о���һ����������
* �汾����ǹ�����������Ŀ¼`.git`,�汾�������ݴ�����stage/index���ͷ�֧��master��
* git add ʵ���ǰ��ļ���ӵ��ݴ����� git commit ���ݴ����������ύ����ǰ��֧


### 2.�����汾��

1. ����git�ֿ��ļ��У���Ϊ��`learngit` 
	
		$ mkdir learngit
	
2. ����leadngit�ļ���

		$ cd learngit
3. ��ʼ��git�ֿ�	
		
		$ git init 
		
### 3. ����ļ�
1. ��`leangit`�����һ��`readme.txt`�ļ������༭һЩ����

2. ��ӵ��ֿ��ݴ����������ݴ��� �ļ������

		$ git add readme.txt	
3. �ύreadme.txt�ļ�����ǰ��֧, -m "�ύ˵��"(ֻ�н��� git add �� go commit �������Ч)

		$ git commit -m "add readme.txt"		
		
### 4. �޸��ļ�
#### 4.1 ���ļ��ڹ�����ʱ
1. �鿴readme.txt�ļ�����

		$ cat readme.txt
2. �޸�readme.txt�ļ�����

3. �鿴�ֿ�״̬

		$ git status
		
4. ��ӵ��ֿ��ݴ��������ύ����֧
		
		$ git add readme.txt
		$ git commit -m "modify readme.txt"
		
#### 4.2 ���ļ����ݴ���ʱ
1. �޸��ļ�����
2. ��ӵ��ֿ��ݴ���

		$ git add readme.txt
3. �ύ����֧

		$ git commit -m "modify readme.txt at the stage"		


### 5. �����޸��ļ���δ�ύ����֧��
#### 5.1 ���ļ��ڹ�����ʱ
1. ִ�г�������

		$ git checkout -- readme.txt
		
#### 5.2 ���ļ����ݴ���ʱ
1. ���ļ��ص�������

		$ git reset HEAD readme.txt
2. ִ�г�������

		$ git checkout -- readme.txt
		
### 6. �汾���ƣ����޴κ�ڣ�

˵������Git�У�`HEAD`��ʾ��ǰ�汾��`HEAD^`��ʾ��һ�汾 `HEAD^^`��ʾ����һ���汾

1. �鿴�ύ��־���(������)
	
		$ git log 

2. �鿴�ύ��־���������棩

		$ git log --pretty=noline
	
3. �ص���һ�汾
	
		$ git reset --hard HEAD^
		
4. �ص�ָ���汾��hard ������Ӱ汾�ţ�

		$ git reset --hard ea34578
	
5. �鿴������ʷ

		$ git reflog
		


### 7. Զ�ֿ̲⣨github��
#### 7.1 ��ӵ�Զ�̿�
1. ��github�ϴ���һ����Ϊ`learngit`�Ŀղֿ�
2. �ڱ���`learngit`�ֿ�����������

		$ git remote add origin git@github.com:iphone5solo/learngit.git
3. �ѱ����������͵�githubԶ�̿���(��һ��push ������ `-u` ����Զ�ֿ̲�)

		$ git push -u origin master
		
ע�⣺�����git push -u origin masterʱ�������´���֤������û���޸�Զ�ֿ̲�Ĺ�Կ��
 	
		
	Permission denied (publickey).
	fatal: Could not read from remote repository.
	
	Please make sure you have the correct access rights
	and the repository exists.
	
���������

1. ��github�ϵ��`Edit profile` --> `SSH and GPG keys` --> `new SSH key` ���SHH��Կ
2. ��`id_rsa.pub`�ļ���/Users/iphone5solo/.ssh/id.rsa.pub��
3. ��`id_rsa.pub`�ļ����ݿ�����key�Ϳ����ˣ�title����

#### 7.2 ��Զ�̿��¡
1. ��github�ϴ���һ����Ϊ`clonegit`�Ĳֿ�
2. ʹ�������¡�ֿ�
		
		$  git clone git@github.com:iphone5solo/clonegit
		
#### 7.3 ��Զ�ֿ̲���±��زֿ⣨�ѹ�����
	
		$ git pull origin master
		
### 8. ��֧����
**ͼ��˵����**

`master`��֧��һ���ߣ�git��`master`ָ�����µ��ύ������`HEAD`ָ��`master`���Դ˲�ȷ����ǰ��֧�����ύ�㡣

<br>
**1. ������֧**

�����Ǵ����µķ�֧������`newBranch`,git�ͻ��½�һ��ָ��`newBranch`,ָ��`master`��ͬ���ύ���ٰ�`HEAD`ָ��`newBranch`,�ͱ�ʾ��ǰ��֧��`newBrach`��

<br>
**2. �·�֧���޸ĺ��ύ**

���ڶԹ��������޸ĺ��ύ�������`newBranch`��֧�ˣ��������ύһ�κ�`newBranch`ָ�����ǰ�ƶ�һ����ָ�������ύ����`master`ָ��ָ�򲻱䡣


<br>
**3. ��֧�ĺϲ�**

��`newBranch`�ϲ���`master`�ϣ�ֱ�Ӱ�`master`ָ��`newBranch`�ĵ�ǰ�ύ��������˺ϲ���


<br>
**4. �ϲ����ɾ����֧**

ɾ����֧`newBranch`����ʣ��һ��`master`��֧

<br>
**5. �鿴��֧�ϲ�ͼ��**



<br>
**���ڷ�֧����Ҫ��������**

* �鿴��֧

		$ git branch
* ����`newBranch`��֧

		$ git branch newBranch
* �л�`HEAD`ָ��`newBranch`��֧

		$ git checkout newBranch
* ����+�л���֧
		
		$ git checkout -b newBranck
* �ϲ�ĳ��֧����ǰ��֧

		$ git merge newBranch
* ��ͨɾ��`newBranch`��֧
	
		$ git branch -d newBranch
		
* ǿ��ɾ��`newBranch`��֧

		$ git branch -D newBranch
		
* �鿴��֧�ϲ�״��

		$ git log --graph --pretty=oneline --abbrev-commit
		
### 9. ���䵱ǰδ�ύ�ķ�֧

�磺 ��ǰ���޸��Լ��ķ�֧`dev`,ͻȻ��Ŀ����Ҫ���޸�һ��bug-07

��������� 

1. ���䵱ǰ`dev`��֧�Ĺ���״̬

		$ git stash
2. �½�һ��`bug-07`��֧

		$ git branch -b bug-07
3. �޸�bug���ύ���ϲ�`bug-07`��`master`��֧
	
		$ git commit -m "fix the bug-07"
		$ git checkout master
		$ git merge --no-ff -m "merge  bug-07" bug-07
	
4. ɾ��`bug-07`��֧

	    $ git branch -d  bug-07
5. �鿴��ǰ`stash`

		$ git stash list
6. �ָ�`dev`��֧�Ĺ���״̬����ɾ��stash����

		$ git stash pop 
	
### 10. ����Э��

* �鿴Զ�̿���Ϣ

		$ git remote
	
 * ��ϸ�鿴Զ����Ϣ
 
 		$ git remote -v
 		
 * ���ͷ�֧��Զ�̿�
 
		$ git remote origin master
		
 * ץȡԶ�̷�֧
 
 		$ git pull origin master
 		
 		
### 11. ��ǩ����
 
 * ����һ����ǩ��Ĭ��Ϊ`HEAD`��ǰ��֧��ӱ�ǩ
 	
 		$ git tag v1.0
 	
 * Ϊ�汾��Ϊ`e8b8ef6`���`v2.0`��ǩ
 
 		$ git tag v2.0 e8b8ef6
 		
 * Ϊ�汾��Ϊ`6cb5a9e`��Ӵ���˵���ı�ǩ��`-a`ָ����ǩ��,`-m`ָ��˵������
 
 		$ git tag -a v3.0 -m "version 0.2 released" 6cb5a9e
 	
 * ���ݱ�ǩ�鿴ָ����֧
 		
 		$ git show v0.2
 * �鿴���б�ǩ
 
 		$ git tag
 		
 * ɾ��`v1.0`��ǩ
 
 		$ git tag -d v1.0
 	
 * ��`v0.9`��ǩ���͵�Զ��
 
 		$ git push origin v0.9
 		
 * ����������δ���͵�Զ�̵ı��ر�ǩ
 
 		$ git push origin --tags
 		
 * ɾ��Զ�̱�ǩ, ��ɾ�����ر�ǩ����ɾ��Զ�̱�ǩ
 		
 		$ git tag -d v0.9
 		$ git push origin :refs/tags/v0.9
