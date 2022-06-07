package cl.aiep.java.biblioteca.model;

import javax.validation.constraints.Size;

import org.springframework.jdbc.core.PreparedStatementSetter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Autor {

	public Autor(Long id2, String nombre2) {
		// TODO Auto-generated constructor stub
	}
	private Long id;
	@Size(min=1,max=50)
	private String nombre;
	public PreparedStatementSetter getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
}