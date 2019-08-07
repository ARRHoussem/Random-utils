package org.sid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.sid.enumeration.EtatDent;

/**
 * 
 * Dentition model dataTable
 * @author arr
 *
 */
@Entity
@Table(name = "Dentition")
	
public class Dentition {
	
	/**
	 *  Generated Serial ID
	 */
	private static final long serialVersionUID = -4716049721963129084L;

	/**
	 * Dentition ID
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dentition_generator")
	@SequenceGenerator(name = "dentition_generator", sequenceName = "DENTITION_SEQ", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;
	/**
	 * Etat par dent
	 */
	@Column(name = "D11")
	@Enumerated(EnumType.STRING)
	private  EtatDent d11;
	@Column(name = "D12")
	@Enumerated(EnumType.STRING)
	private  EtatDent d12;
	@Column(name = "D13")
	@Enumerated(EnumType.STRING)
	private  EtatDent d13;
	@Column(name = "D14")
	@Enumerated(EnumType.STRING)
	private  EtatDent d14;
	@Column(name = "D15")
	@Enumerated(EnumType.STRING)
	private  EtatDent d15;
	@Column(name = "D16")
	@Enumerated(EnumType.STRING)
	private  EtatDent d16;
	@Column(name = "D17")
	@Enumerated(EnumType.STRING)
	private  EtatDent d17;
	@Column(name = "D18")
	@Enumerated(EnumType.STRING)
	private  EtatDent d18;
	@Column(name = "D21")
	@Enumerated(EnumType.STRING)
	private  EtatDent d21;
	@Column(name = "D22")
	@Enumerated(EnumType.STRING)
	private  EtatDent d22;
	@Column(name = "D23")
	@Enumerated(EnumType.STRING)
	private  EtatDent d23;
	@Column(name = "D24")
	@Enumerated(EnumType.STRING)
	private  EtatDent d24;
	@Column(name = "D25")
	@Enumerated(EnumType.STRING)
	private  EtatDent d25;
	@Column(name = "D26")
	@Enumerated(EnumType.STRING)
	private  EtatDent d26;
	@Column(name = "D27")
	@Enumerated(EnumType.STRING)
	private  EtatDent d27;
	@Column(name = "D28")
	@Enumerated(EnumType.STRING)
	private  EtatDent d28;
	@Column(name = "D31")
	@Enumerated(EnumType.STRING)
	private  EtatDent d31;
	@Column(name = "D32")
	@Enumerated(EnumType.STRING)
	private  EtatDent d32;
	@Column(name = "D33")
	@Enumerated(EnumType.STRING)
	private  EtatDent d33;
	@Column(name = "D34")
	@Enumerated(EnumType.STRING)
	private  EtatDent d34;
	@Column(name = "D35")
	@Enumerated(EnumType.STRING)
	private  EtatDent d35;
	@Column(name = "D36")
	@Enumerated(EnumType.STRING)
	private  EtatDent d36;
	@Column(name = "D37")
	@Enumerated(EnumType.STRING)
	private  EtatDent d37;
	@Column(name = "D38")
	@Enumerated(EnumType.STRING)
	private  EtatDent d38;
	@Column(name = "D41")
	@Enumerated(EnumType.STRING)
	private  EtatDent d41;
	@Column(name = "D42")
	@Enumerated(EnumType.STRING)
	private  EtatDent d42;
	@Column(name = "D43")
	@Enumerated(EnumType.STRING)
	private  EtatDent d43;
	@Column(name = "D44")
	@Enumerated(EnumType.STRING)
	private  EtatDent d44;
	@Column(name = "D45")
	@Enumerated(EnumType.STRING)
	private  EtatDent d45;
	@Column(name = "D46")
	@Enumerated(EnumType.STRING)
	private  EtatDent d46;
	@Column(name = "D47")
	@Enumerated(EnumType.STRING)
	private  EtatDent d47;
	@Column(name = "D48")
	@Enumerated(EnumType.STRING)
	private  EtatDent d48;
	@Column(name = "D51")
	@Enumerated(EnumType.STRING)
	private  EtatDent d51;
	@Column(name = "D52")
	@Enumerated(EnumType.STRING)
	private  EtatDent d52;
	@Column(name = "D53")
	@Enumerated(EnumType.STRING)
	private  EtatDent d53;
	@Column(name = "D54")
	@Enumerated(EnumType.STRING)
	private  EtatDent d54;
	@Column(name = "D55")
	@Enumerated(EnumType.STRING)
	private  EtatDent d55;
	@Column(name = "D61")
	@Enumerated(EnumType.STRING)
	private  EtatDent d61;
	@Column(name = "D62")
	@Enumerated(EnumType.STRING)
	private  EtatDent d62;
	@Column(name = "D63")
	@Enumerated(EnumType.STRING)
	private  EtatDent d63;
	@Column(name = "D64")
	@Enumerated(EnumType.STRING)
	private  EtatDent d64;
	@Column(name = "D65")
	@Enumerated(EnumType.STRING)
	private  EtatDent d65;
	@Column(name = "D71")
	@Enumerated(EnumType.STRING)
	private  EtatDent d71;
	@Column(name = "D72")
	@Enumerated(EnumType.STRING)
	private  EtatDent d72;
	@Column(name = "D73")
	@Enumerated(EnumType.STRING)
	private  EtatDent d73;
	@Column(name = "D74")
	@Enumerated(EnumType.STRING)
	private  EtatDent d74;
	@Column(name = "D75")
	@Enumerated(EnumType.STRING)
	private  EtatDent d75;
	@Column(name = "D81")
	@Enumerated(EnumType.STRING)
	private  EtatDent d81;
	@Column(name = "D82")
	@Enumerated(EnumType.STRING)
	private  EtatDent d82;
	@Column(name = "D83")
	@Enumerated(EnumType.STRING)
	private  EtatDent d83;
	@Column(name = "D84")
	@Enumerated(EnumType.STRING)
	private  EtatDent d84;
	@Column(name = "D85")
	@Enumerated(EnumType.STRING)
	private  EtatDent d85;
	

    /**
     * id patient
     */
    @JoinColumn(name = "patient_id")
    private Long patient;
	
	
}
