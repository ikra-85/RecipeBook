package app.vaadin.recipebook.views.register;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class RegisterView extends FormLayout implements View {

	private static final long serialVersionUID = -5149175781838301995L;
	private final TextField email = new TextField("Enter email: ");
	private final PasswordField passwd = new PasswordField("Password ");
	private final PasswordField retyped = new PasswordField("Retype the password ");
	private final CheckBox accept = new CheckBox("Accept terms and conditions");
	
	public RegisterView() {
		for (Component c : new Component[]{email, passwd, retyped, accept} ) {
			this.addComponent(c);
		}
	
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		
		
	}

}
