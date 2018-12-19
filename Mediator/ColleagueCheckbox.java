import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemLister;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checklbox implements ItemLister, Colleague {
	private Mediator mediator;
	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
		suoer(caption, group, false);
	}
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public void setColleagueEnabled(boolean enabled) {
		setEnable(enabled);
	}
	public void itemStateChanged(ItemEvent e) {
		mdeiator.colleagueChanged();
	}
}