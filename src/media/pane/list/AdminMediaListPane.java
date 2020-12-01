package media.pane.list;

import abstractdata.controller.ADataPageController;
import abstractdata.controller.IDataManageController;
import abstractdata.pane.list.ADataListPane;
import abstractdata.pane.single.ADataSinglePane;
import api.MediaApi;
import com.oms.bean.Media;
import com.oms.bean.media.physical.Book;
import dialog.edit.media.physical.BookEditDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMediaListPane extends ADataListPane<Media> {

    public AdminMediaListPane(ADataPageController<Media> controller) {
        this.controller = controller;
    }

    @Override
    public void decorateSinglePane(ADataSinglePane<Media> singlePane) {

        JButton button = new JButton("Edit");
        singlePane.addDataHandlingComponent(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookEditDialog(singlePane.getData(), new IDataManageController<Media>() {
                    @Override
                    public void create(Media media) {

                    }

                    @Override
                    public void read(Media media) {

                    }

                    @Override
                    public void delete(Media media) {

                    }

                    @Override
                    public void update(Media media) {
                        (new MediaApi()).updateBook((Book) media);
                    }
                });
            }
        });
    }
}
