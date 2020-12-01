package media.pane.single;

import com.oms.bean.Media;
import com.oms.bean.media.physical.Book;

import javax.swing.*;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	private JLabel labelPublisher;
	private JLabel labelPublication;
	private JLabel labelAuthors;
	private JLabel labelNumOfPages;
	private JLabel labelLanguage;

	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}

	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublisher = new JLabel();
		add(labelPublisher, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublication = new JLabel();
		add(labelPublication, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelAuthors = new JLabel();
		add(labelAuthors, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumOfPages = new JLabel();
		add(labelNumOfPages, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLanguage = new JLabel();
		add(labelLanguage, c);
	}

	@Override
	public void displayData() {
		super.displayData();

		if (t instanceof Book) {
			Book book = (Book) t;

			labelPublisher.setText("Publisher: " + book.getPublisher());
			labelPublication.setText("Publication: " + book.getPublicationDate());
			labelAuthors.setText("Authors: " + book.getAuthors());
			labelNumOfPages.setText("Number Of Pages: " + book.getNumberOfPages());
			labelLanguage.setText("Language: " + book.getLanguage());
		}
	}
}
