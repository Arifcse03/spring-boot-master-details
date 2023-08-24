package com.MnJmasterDetailsProject.MasterDetailsProject.model;
import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@ToString
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "XX_SS_FABRIC_REQ_H", schema = "SMART_STORE")

public class HeaderTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REQ_ID")
    private Long reqId;

    @Column(name = "SYSTEM_ID")
    private Long systemId;

    @Column(name = "SHADE")
    private String shade;

    @Column(name = "SHRINK")
    private String shrink;

    @Column(name = "QTY")
    private Long qty;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "PATTERN")
    private String pattern;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name = "STATUS")
    private Long status;

    @Column(name = "LINE_NO")
    private String lineNo;

    @Column(name = "WIDTH")
    private Long width;

    @Column(name = "ROLL_QTY")
    private Long rollQty;

    @Column(name = "YARDS_QTY")
    private Long yardsQty;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "REQ_ID", referencedColumnName = "REQ_ID")
    List< ChildTable > childTables = new ArrayList< >();
}
