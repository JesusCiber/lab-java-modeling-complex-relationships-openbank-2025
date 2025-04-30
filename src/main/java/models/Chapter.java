package models;

import jakarta.persistence.*;
import models.Member;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @Column(name = "chapter_id")
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id",referencedColumnName = "member_id")
    private Member president;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "chapter_id")
    private List<Member> list;

    public Chapter() {
        list = new ArrayList<>();
    }

    public Chapter( String name, String district, Member president) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.list = new ArrayList<>();
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getList() {
        return list;
    }

    public void setList(List<Member> list) {
        this.list = list;
    }
}
