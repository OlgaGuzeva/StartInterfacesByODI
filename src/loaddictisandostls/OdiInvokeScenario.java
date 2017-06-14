package loaddictisandostls;

import static loaddictisandostls.Settings.prop;
import oracle.odi.runtime.agent.invocation.ExecutionInfo;
import oracle.odi.runtime.agent.invocation.InvocationException;
import oracle.odi.runtime.agent.invocation.RemoteRuntimeAgentInvoker;
import oracle.odi.runtime.agent.invocation.StartupParams;
/**
 *
 * @author guzeva
 */
public class OdiInvokeScenario {//implements Runnable{
    
    MainFrame mf;
    String odiScenName;
    String odiScenVersion;
    StartupParams odiStartupParams;
    String odiKeywords;
    String odiContextCode;
    int odiLogLevel;
    String odiSessionName;
    boolean odiSynchronous;
                                    
    public OdiInvokeScenario(MainFrame mf,String scenName,String scenVersion,
                             StartupParams odiStartupParams,String odiKeywords,String odiContextCode,
                             int odiLogLevel,String odiSessionName,boolean odiSynchronous){
        
        this.mf                 = mf;
        this.odiScenName        = scenName;
        this.odiScenVersion     = scenVersion;
        this.odiStartupParams   = odiStartupParams;
        this.odiKeywords        = odiKeywords;
        this.odiContextCode     = odiContextCode;
        this.odiLogLevel        = odiLogLevel; 
        this.odiSessionName     = odiSessionName;
        this.odiSynchronous     = odiSynchronous;      
        
        Thread thread = new Thread(){
            public void run(){
                try{ runScenario();
                }catch (Exception e){
                    e.printStackTrace();            
                }
            }
        };
        thread.start();
    }
   
    public void runScenario() throws InvocationException {
        try{
        
            //Starting the session on the remote agent.
            RemoteRuntimeAgentInvoker remoteRuntimeAgentInvoker = 
            new RemoteRuntimeAgentInvoker(prop.getProperty("ODI_HOST"),prop.getProperty("ODI_USER"),
                                          prop.getProperty("ODI_PASS").toCharArray());
                       
            ExecutionInfo exeInfo = 
                    remoteRuntimeAgentInvoker.invokeStartScenario(odiScenName,odiScenVersion,odiStartupParams,
                           odiKeywords,odiContextCode,odiLogLevel,
                           odiSessionName,odiSynchronous,prop.getProperty("ODI_WORK_REP"));

            mf.setStatus("Scenario Started in Session : " + exeInfo.getSessionId() + "\n");
            mf.setStatus("Scenario Session Status : " + exeInfo.getSessionStatus() + "\n");
            mf.setIsLoading(false);
        }
        catch (Exception e)    {
            mf.setStatus("Connection error!!!");
            mf.setIsLoading(false);
            e.printStackTrace();
        }
    }
}




