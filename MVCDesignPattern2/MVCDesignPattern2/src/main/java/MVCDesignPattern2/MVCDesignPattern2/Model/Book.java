package MVCDesignPattern2.MVCDesignPattern2.Model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="book_eclipse")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_Id")
	private int bookId;
	
	@Column(name="book_Name",nullable = false)
	private String bookName;
	
	@Column(name="book_Publisher_Name",nullable = false)
	private String bookPublisherName;
	
	@Lob
	@Column(name="book_Description",nullable = false, length = 512)
	private String bookDescription;
	
	@Column(name="book_Price",nullable = false)
	private double bookPrice;
	
	@UpdateTimestamp
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="boo_kPublishing_Date")
	private LocalDateTime bookPublishingDate=LocalDateTime.now();
	
	
	public Book() {
		
	}
	
	public Book(int bookId, String bookName, String bookPublisherName, String bookDescription, double bookPrice,
			LocalDateTime bookPublishingDate) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPublisherName = bookPublisherName;
		this.bookDescription = bookDescription;
		this.bookPrice = bookPrice;
		this.bookPublishingDate = bookPublishingDate;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPublisherName() {
		return bookPublisherName;
	}

	public void setBookPublisherName(String bookPublisherName) {
		this.bookPublisherName = bookPublisherName;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public LocalDateTime getBookPublishingDate() {
		return bookPublishingDate;
	}

	public void setBookPublishingDate(LocalDateTime bookPublishingDate) {
		this.bookPublishingDate = bookPublishingDate;
	}
	
	
}
