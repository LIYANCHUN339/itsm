# itsm
记录github代码管理的步骤
github上不去或者网页打开不正常
在hosts文件中加入下列IP，保存即可生效
#github
  192.30.253.113 github.com
  192.30.253.113 github.com
  192.30.253.118 gist.github.com
  192.30.253.119 gist.github.com
windows下路径为：C:\Windows\System32\drivers\etc\hosts 
Linux下路径：/etc/hosts
1.进入Github首页，点击New repository新建一个项目
 2.填写相应信息后点击create即可 
Repository name: 仓库名称
Description(可选): 仓库描述介绍
Public, Private : 仓库权限（公开共享，私有或指定合作者）
Initialize this repository with a README: 添加一个README.md
gitignore: 不需要进行版本管理的仓库类型，对应生成文件.gitignore
license: 证书类型，对应生成文件LICENSE
4.点击Clone or dowload会出现一个地址，copy这个地址备用。
5.接下来就到本地操作了，首先右键你的项目，如果你之前安装git成功的话，右键会出现两个新选项，分别为Git Gui Here,Git Bash Here,这里我们选择Git Bash Here，进入如下界面，Test_Bluetooth即为我的项目名。
6.接下来输入如下代码（关键步骤），把github上面的仓库克隆到本地




