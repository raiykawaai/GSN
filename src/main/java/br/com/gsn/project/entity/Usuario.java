package br.com.gsn.project.entity;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Table(name = "TB_USUARIO")
@SequenceGenerator(name = "SQ_USUARIO", sequenceName = "SQ_USUARIO", initialValue = 1)
@Entity
public class Usuario {
    @Id
    @Column(name = "cd_usuario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    private Long id;

    @Column(name = "nm_usuario")
    private String name;
    @Column(name = "ds_email")
    private String email;
    @Column(name = "ds_senha")
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Jardim> jardins;

    public Usuario() {
    }

    public Usuario(Long id, String name, String email, String password, List<Jardim> jardins) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.jardins = jardins;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return this.email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Jardim> getJardins() {
        return jardins;
    }

    public void setJardins(List<Jardim> jardins) {
        this.jardins = jardins;
    }
}



