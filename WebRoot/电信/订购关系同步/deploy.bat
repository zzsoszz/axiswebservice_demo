set Axis_Lib=D:\bxdev\trunck\tool\axis\axis-bin-1_4\axis-1_4\lib
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib%
set Axis_Servlet=http://localhost:9001/axiswebservice/services/IsmpSpEngine
%Java_Cmd% org.apache.axis.client.AdminClient -l %Axis_Servlet%  D:\bxdev\trunck\website\axiswebservice\WebRoot\WEB-INF\deploy.wsdd