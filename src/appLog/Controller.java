package appLog;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class Controller {
	@FXML
	private TextFlow tfAppLog;
	@FXML
	private Button btn1;
	
	public void showText(ActionEvent event) {
		Font myFont = getCascadia();
		Text text = new Text();
		text.setFont(getCascadia());
		List<String> families = Font.getFamilies();
		for (String family:families) {
			text = new Text(family + "\n");
			text.setFont(myFont);
			tfAppLog.getChildren().add(text);	
		}// for
		
	}// showText
	public   Font getCascadia() {
		String FONT = "CascadiaMono.ttf";
		Font target = Font.font(FONT);

		if (!target.getName().equals(FONT)) {
			try {
				target = Font.loadFont(getClass().getResourceAsStream("/resources/" + FONT),25);
			} catch (Exception e) {
				System.err.println(" cannot load " + FONT);
			} // try 
		} // if
		return target;
	}// getCascadia
}/// class Controller
