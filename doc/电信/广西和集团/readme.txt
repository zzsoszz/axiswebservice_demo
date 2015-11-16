1.下载soapui工具
2.通过soapui生成axis文件
3.把生成的代码拷贝到工程里面
4.在web.xml新增配置用于启动axis
5.启动tomcat
6.拷贝deploy.bat到生成的代码的路径下并且修改路径,然后执行deploy.bat
7.然后在tomcat的WEB_INFO目录下会生成一个server-config.wsdd的文件,axis会扫描此文件进行webservice发布

