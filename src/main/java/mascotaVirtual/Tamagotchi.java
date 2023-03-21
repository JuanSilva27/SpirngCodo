package mascotaVirtual;

public class Tamagotchi {
	private String nombre;
	private Integer nivel;
	private String estado;
	private Integer tiempoEnMinutos;
	
	//Geters y Seters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getNivel() {
		return nivel;
	}


	public void setNivel(Integer nivel) {
		if(nivel<0) {
			this.nivel = 0;
		}
		this.nivel = nivel;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public Integer getTiempoEnMinutos() {
		return tiempoEnMinutos;
	}


	public void setTiempoEnMinutos(Integer tiempoEnMinutos) {
		this.tiempoEnMinutos = tiempoEnMinutos;
	}

	//Constructor

	public Tamagotchi() {
		this.nivel = 0;
		this.tiempoEnMinutos = 0;
	};
	
	public Tamagotchi(String nombre) {
		this.nivel = 0;
		this.tiempoEnMinutos = 0;
		this.nombre = nombre;
	};
	
	//Metodos
	
	public void comer() {
		switch (this.estado) {
			case "Hambirenta":
				this.estado="Contenta";
				break;
			case "Contenta":
				this.nivel++;
				break;
			case "Aburrida":
				if(this.tiempoEnMinutos>80) {
					this.estado="Contenta";
				}
				break;
			default :
				System.out.println("Estado Desconocido");
				break;
		}
	};
	
	public void jugar() {
		if(this.puedeJugar()) {
			switch (this.estado) {
				case "Hambirenta":
					System.out.println("La accion no a tenido ningun efecto");
					break;
				case "Contenta":
					this.nivel += 2;
					break;
				case "Aburrida":
					this.estado="Contenta";
					break;
				default :
					System.out.println("Estado Desconocido");
					break;
			}
		}
	};
	
	public Boolean puedeJugar() {
		return this.estado.equals("Hambrienta") ? false : true;
	};
}
