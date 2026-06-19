package Portfolio.Sistema.AAA.entity;

import Portfolio.Sistema.AAA.Enum.StatusAAAClient;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Table(name = "aaa_clients")
@Entity
public class AaaClient {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "name", nullable = false)
private String name;

@Column(name = "ip_address", nullable = false)
private String ipAddress;

@Column(name = "shared_secret_hash", nullable = false)
private String sharedSecretHash;

@Enumerated(EnumType.STRING)
@Column(name = "status", nullable = false)
private StatusAAAClient status;

@Column(name = "description", nullable = false)
private String description;

@CreationTimestamp
@Column(name = "created_at", nullable = false)
private LocalDateTime createdAt;

@CreationTimestamp
@Column(name = "updated_at", nullable = false)
private LocalDateTime updatedAt;

}
