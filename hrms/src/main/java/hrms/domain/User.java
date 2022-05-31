package hrms.domain;

import hrms.domain.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="hrms_user")
public class User extends BaseEntity {

}
