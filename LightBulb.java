package yahiya.attemp2;
public class LightBulb implements LightBulbState
{
 
 private LightBulbState lightBulbState;
 
 public LightBulbState getLightBulbState()
 {
 return lightBulbState;
 }
 
 public void setLightBulbState(LightBulbState lightBulbState)
 {
 this.lightBulbState = lightBulbState;
 
 }
 
 @Override
 public void switchOnOffLightBulb()
 {
 System.out.println("Current state Of Light Bulb : " + 
 lightBulbState.getClass().getName());
 lightBulbState.switchOnOffLightBulb();
 
 }
 
}