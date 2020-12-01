package media.controllers.admin;

import abstractdata.controller.ADataPageController;
import abstractdata.pane.list.ADataListPane;
import media.pane.list.AdminMediaListPane;

public abstract class AdminMediaPageController extends ADataPageController {
    public AdminMediaPageController() { super(); }

    @Override
    public ADataListPane createListPane() {
        return new AdminMediaListPane(this);
    }
}
