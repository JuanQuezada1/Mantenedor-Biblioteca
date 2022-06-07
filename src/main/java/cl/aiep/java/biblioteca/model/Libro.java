package cl.aiep.java.biblioteca.model;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Libro {

	private Long id;
	@Size(min=1,max=50)
	private String nombre;
	@Size(max=250)
	private String descripcion;
	private Long autor_id;
	private Autor autor;
	
	public Libro(Long id2, String nombre2, String descripcion2, Long autorId, Autor autor2) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAutor_id() {
		return autor_id;
	}
	public void setAutor_id(Long autor_id) {
		this.autor_id = autor_id;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Object getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
}