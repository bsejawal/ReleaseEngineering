package np.com.vesh

import file.FileUtils
import org.codehaus.groovy.grails.commons.ApplicationHolder
import org.codehaus.groovy.grails.web.context.ServletContextHolder
import security.EncryptionUtils
import ssh.RemoteSSH

class IndexController {
    def testService
    def sshConfig



    def index() {
//        ApplicationHolder.getApplication().getParentContext().getResource("bash/ssh.sh").getFile();
//        applicationContent.getResource("/").getFile()
        File script = applicationContext.getResource("bash/ssh.sh").getFile()
        script.getText().execute()
        render "completed ::@@@@q"
    }

}

/*

int port=22

def password = EncryptionUtils.decrypt("hoNKFlTNeixSa/8lz3FBhg==")

RemoteSSH ash=new RemoteSSH('10.0.1.180', 'bsejawal', password,'', 'tail -n 3000 /usr/share/tomcat/uat/logs/catalina.out','',port)
def result=ash.Result(sshConfig)
def path = ServletContextHolder.servletContext.getRealPath('/dumpFile/tailDump.log')
println"before file UTILS"
FileUtils.writeStringToFile(path, result.toString())
render("RESULT ::: <br />$result")*/
