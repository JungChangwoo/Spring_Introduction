package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// JPA는 객체랑 ORM기술인데 ORM은 Object와 Relatinal Database를 Mapping
//JPA가 관리하는 Entity구나,,
@Entity
public class Member {
    // PK를 알려주고 // ID값은 database에서 자동으로 생성되던 것 << indentity 전략
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //@Comlumn(name = "username") << 이런식으로 Column의 이름으로 해줄 수도 있음
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
