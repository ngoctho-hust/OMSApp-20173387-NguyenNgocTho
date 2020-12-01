package media.controllers.admin;

import abstractdata.pane.search.ADataSearchPane;
import abstractdata.pane.single.ADataSinglePane;
import api.MediaApi;
import media.pane.search.BookSearchPane;
import media.pane.single.BookSinglePane;

import java.util.List;
import java.util.Map;

public class AdminBookPageController extends AdminMediaPageController {
    public AdminBookPageController() { super(); }
    @Override
    public List search(Map searchParams) {
        return new MediaApi().getBooks(searchParams);
    }

    @Override
    public ADataSinglePane createSinglePane() {
        return new BookSinglePane();
    }

    @Override
    public ADataSearchPane createSearchPane() {
        return new BookSearchPane();
    }
}
