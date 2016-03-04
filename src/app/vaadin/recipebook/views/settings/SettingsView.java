package app.vaadin.recipebook.views.settings;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class SettingsView extends VerticalLayout implements View {

	private static final long serialVersionUID = -6691440046475639091L;
	private final TextField email = new TextField("Enter email: ");
	private final TextField username = new TextField("Your name: ");
	private final Button save = new Button("Save changes");
	private final Button cancel = new Button("Abort");
	private final Button recipes = new Button("Yuour recipes");

	public SettingsView() {
		for (Component c : new Component[]{email, username, save, cancel, recipes} ) {
			this.addComponent(c);
		}
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
