package cn.edu.sdu.middleware.axis2.modules;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Yonggang Yuan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Account"
    , propOrder = {
        "id"
        , "name"
        , "balance"
    }
)
public class Account implements Serializable{

    private static final long serialVersionUID = 2504061277038855739L;

    @XmlElement(name="id", required=true)
    private String id;

    @XmlElement(name="name", required=true)
    private String name;

    @XmlElement(name="balance", required=true)
    private Double balance;

    public Account(){}

    public Account(String name, Double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Account other = (Account) obj;
        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) return false;
        return true;
    }

}
