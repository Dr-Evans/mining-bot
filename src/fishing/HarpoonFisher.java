package fishing;

import org.osbot.rs07.api.model.Entity;
import org.osbot.rs07.script.Script;

public abstract class HarpoonFisher extends Fisher {

	HarpoonFisher(Script script) {
		super(script);
	}
	
	@Override
	protected void gather() {
		Entity fishingSpot = selectResource();
        
		if (fishingSpot != null) {
			fishingSpot.interact("Harpoon");
		}
	}   
	
	@Override
	protected void deposit() {
		getScript().bank.depositAllExcept("Harpoon");
	}
	
	@Override
	public String toString() {
		return "Harpoon " + super.toString();
	}
	
}
