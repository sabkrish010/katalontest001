package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile LACS-Test-Emmal : LACS test site
Profile TIU-Test-Phil : TIU Test site
Profile default : LACS test site</p>
     */
    public static Object Hostname
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object NewUser
     
    /**
     * <p></p>
     */
    public static Object NewFirstName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            Hostname = selectedVariables['Hostname']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            NewUser = selectedVariables['NewUser']
            NewFirstName = selectedVariables['NewFirstName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
