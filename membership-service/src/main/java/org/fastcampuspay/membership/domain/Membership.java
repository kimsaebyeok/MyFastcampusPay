package org.fastcampuspay.membership.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {

    @Getter
    private final String membershipId;
    @Getter
    private final String name;
    @Getter
    private final String email;
    @Getter
    private final String address;
    @Getter
    private final boolean isValid;
    @Getter
    private final boolean isCorp;

    public static Membership generateMember(
            MembershipId membershipId,
            MembershipName membershipName,
            MembershipEmail membershipEmail,
            MembershipAddress membershipAddress,
            MembershipIsValid membershipIsValid,
            MembershipIsCorp membershipIsCorp) {
        return new Membership(
                membershipId.membershipId,
                membershipName.name,
                membershipEmail.email,
                membershipAddress.address,
                membershipIsValid.isValid,
                membershipIsCorp.isCorp);
    }

    @Value
    public static class MembershipId {
        public MembershipId(final String value) {
            this.membershipId = value;
        }
        String membershipId;
    }

    @Value
    public static class MembershipName {
        public MembershipName(final String value) {
            this.name = value;
        }
        String name;
    }

    @Value
    public static class MembershipEmail {
        public MembershipEmail(final String value) {
            this.email = value;
        }
        String email;
    }

    @Value
    public static class MembershipAddress {
        public MembershipAddress(final String value) {
            this.address = value;
        }
        String address;
    }

    @Value
    public static class MembershipIsValid {
        public MembershipIsValid(final boolean value) {
            this.isValid = value;
        }
        boolean isValid;
    }

    @Value
    public static class MembershipIsCorp {
        public MembershipIsCorp(final boolean value) {
            this.isCorp = value;
        }
        boolean isCorp;
    }
}
