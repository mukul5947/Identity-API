package com.iemr.common.identity.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import com.iemr.common.identity.domain.Address;
import com.iemr.common.identity.domain.Contact;
import com.iemr.common.identity.domain.Identity;

import lombok.Data;

@Data
public class IdentityEditDTO {

	private String eventTypeName; // created, reserved, registered, modified, deleted
	private Timestamp eventTypeDate;
	private Integer agentId;
	private String agentName;
	private Integer agentPSMapId; // ProviderServiceMapId
	private String agentComment;
	private Integer serviceId;
	private String serviceName;
	private Integer serviceProviderId;
	private String serviceProviderName;
	private Integer stateId;
	private String stateName;
	private Integer providerServiceMapId;
	private BigInteger beneficaryId;
	private BigInteger beneficiaryRegId;

	// self details
	private Boolean changeInSelfDetails = false;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private Integer maritalStatusId;
	private String maritalStatus;
	private Timestamp dob;
	private Integer genderId;
	private String gender;
	private Integer titleId;
	private String title;
	// private Integer parkingPlaceId;
	private String literacyStatus;

	// self address
	private Boolean changeInAddress = false;
	private Address currentAddress;
	private Address permanentAddress;
	private Address emergencyAddress;
	private Boolean isPermAddrSameAsCurrAddr;
	private Boolean isPermAddrSameAsEmerAddr;
	private Boolean isEmerAddrSameAsCurrAddr;
	private Boolean isEmerAddrSameAsPermAddr;
	private String addressType;

	// self contacts
	private Boolean changeInContacts = false;
	private Contact contact;
	private String preferredEmailId;

	// self identities
	private Boolean changeInIdentities = false;
	private List<Identity> identities;

	// self details
	private Boolean changeInOtherDetails = false;
	private Integer preferredLanguageId;
	private String preferredLanguage;
	private Integer communityId;
	private String community;
	private Integer educationId;
	private String education;
	private Integer incomeStatusId;
	private String incomeStatus;
	private Integer occupationId;
	private String occupation;
	private Integer religionId;
	private String religion;
	private String placeOfWork;
	private Integer healthCareWorkerId;
	private String healthCareWorker;

	// family details
	private Boolean changeInFamilyDetails = false;
	List<BenFamilyDTO> benFamilyDTOs;
	// private Boolean isEmergencyContact;
	// private String relationshipToSelf;
	// private BigInteger associatedBenRegId; // Family mapping must be a list

	// List<BenFamilyDTO> benFamilyDTOs;

	// MMU/TM details
	private Boolean changeInAssociations = false;

	private Integer zoneId;
	private Integer areaId;
	private BigInteger servicePointId;
	private Integer phcId;
	private String remarks;
	private String sourceOfInfo;
	private Integer statusId;
	private String status;

	/*
	 * New columns added for MMU integration 11-04-2018
	 */
	private Boolean changeInBankDetails = false;
	private String bankName;
	private String branchName;
	private String ifscCode;
	private String accountNo;
	private BigInteger benAccountID;

	private Boolean changeInBenImage = false;
	private String benImage;
	private Long benImageId;

	private Timestamp marriageDate;
	private Integer ageAtMarriage;

	// Start 1097
	private Integer sexualOrientationID;
	private String sexualOrientationType;
	private String isHIVPositive;
	// End 1097

	private Integer vanID;
	private Integer parkingPlaceId;
}