package it.uniroma3.siw.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libri {
	@Id   
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;
	private Integer year;
	private String urlImage;

	public Libri() {

	}
	
	//GETTERS AND SETTERS
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public Integer getYear() {
			return year;
		}
		
		public void setYear(Integer year) {
			this.year = year;
		}
		
		public String getUrlImage() {
			return urlImage;
		}
		
		public void setUrlImage(String urlImage) {
			this.urlImage = urlImage;
		}
		
		//OVERRIDE METHODS EQUALS AND HASHCODE
		
		@Override
		public boolean equals(Object o) {
			if(this == o) return true;
			if(o == null || getClass() != o.getClass()) return false;
			
			Libri libri = (Libri) o;
			return Objects.equals(title, libri.title) &&
				   Objects.equals(year, libri.year);
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(title,year);
		}
	
	
}

