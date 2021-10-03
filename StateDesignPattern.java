package yahiya.attemp2;

public class StateDesignPattern
{
 
 public static void main( String[] args )
 {
 LightBulb lightbulb= new LightBulb();
 LightBulbState lightBulbSwitchOnState = new LightBulbSwitchOnState();
 LightBulbState lightBulbSwitchOffState = new LightBulbSwitchOffState ();
 
 lightbulb.setLightBulbState(lightBulbSwitchOnState);
 lightbulb.switchOnOffLightBulb();
 
 lightbulb.setLightBulbState(lightBulbSwitchOffState);
 lightbulb.switchOnOffLightBulb();
 }
 
}
