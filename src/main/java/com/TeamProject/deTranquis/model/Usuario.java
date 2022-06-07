package com.TeamProject.deTranquis.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {

    @Autowired

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "apellido")
    String apellido;

    @Column(name = "correo")
    String correo;

    @Column(name = "imagenperfil")
    String imagenPerfil;

    @Column(name = "tipo")
    String tipo;

}
