package com.MnJmasterDetailsProject.MasterDetailsProject.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "XX_SS_FABRIC_REQ_L", schema = "SMART_STORE")
public class ChildTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LINE_ID")
    private Long lineId;

    @ManyToOne
    @JoinColumn(name = "REQ_ID", referencedColumnName = "REQ_ID")
    private HeaderTable header;

    @Column(name = "SYSTEM_ID")
    private Long systemId;

    @Column(name = "POC_ID")
    private Long pocId;

    @Column(name = "BUYER_ID")
    private Long buyerId;

    @Column(name = "SUPPLIER_ROLL_NO")
    private String supplierRollNo;

    @Column(name = "FACTORY_ROLL_NO")
    private String factoryRollNo;

    @Column(name = "ROLL_LENGTH")
    private Double rollLength;

    @Column(name = "ROLL_WIDTH")
    private Double rollWidth;

    @Column(name = "SHIRINK_LEN")
    private Double shrinkLength;

    @Column(name = "SHRINK_PERCENT_LEN")
    private Double shrinkPercentLength;

    @Column(name = "SHRINK_WIDTH")
    private Double shrinkWidth;

    @Column(name = "SHRINK_PERCENT_WIDTH")
    private Double shrinkPercentWidth;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name = "RFID")
    private String rfid;

    @Column(name = "RFID_ATTACH_DATE")
    private Date rfidAttachDate;

    @Column(name = "RFID_ATTACH_BY")
    private Long rfidAttachBy;

    @Column(name = "RFID_DETACH_DATE")
    private Date rfidDetachDate;

    @Column(name = "RFID_DETACH_BY")
    private Long rfidDetachBy;

    @Column(name = "RFID_FLAG")
    private Long rfidFlag;

    @Column(name = "STATUS")
    private Long status;

    @Column(name = "SHADE")
    private String shade;
}
