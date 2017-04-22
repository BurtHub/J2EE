#  个人博客系统系统需求分析
* 系统名称：个人博客系统
* 用户：在校大学生，高端知识分子
	用户类别：管理员，注册用户，游客
* 用途：建立博客技术交流平台，通过平台系统传播JSP网页搭建知	识，造福人类
* 目标：简单的文章发表，存储功能，关键字查询，私聊功能

#### 功能模块需求分析

* 登陆与注册模块
* 登陆采用用户名和密码有效性检查，防止重复注册
* 本地Cookie存储已登陆的用户数据（默认七天）
* 管理员有管理所有用户权限，默认管理员ADMIN，密码admin
* 
	文章板块（用户浏览部分）
		默认预览标题+摘要+文章前120字
		全文阅读显示全文

*	个人后台板块
		功能有，私聊管理，用户发帖管理，个人信息界面
		私聊只保存最近20条消息
*	个人信息包括用户名，头像，性别，爱好，个人简介，毕业学校
		权限，可以删除自己的发帖，可以与所有已注册用户私聊
		管理员具有删除所有帖子的权限
*	查询版块
		帖子查询，注册用户查询（只对注册用户开放）