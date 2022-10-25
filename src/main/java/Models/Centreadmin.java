package Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "centreadmin")
@NoArgsConstructor
@Data
public class Centreadmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "caid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idcenter", nullable = false)
    private Center idcenter;

    @Column(name = "cafullname", nullable = false)
    private String cafullname;

    @Column(name = "caemail", nullable = false)
    private String caemail;

    @Column(name = "capassword", nullable = false)
    private String capassword;

    public Centreadmin(Center idcenter, String cafullname, String caemail, String capassword) {
        this.idcenter = idcenter;
        this.cafullname = cafullname;
        this.caemail = caemail;
        this.capassword = capassword;
    }
}