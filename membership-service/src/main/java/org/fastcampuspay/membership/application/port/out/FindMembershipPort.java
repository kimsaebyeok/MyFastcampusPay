package org.fastcampuspay.membership.application.port.out;

import org.fastcampuspay.membership.adapter.out.persistence.MembershipJpaEntity;
import org.fastcampuspay.membership.domain.Membership;

public interface FindMembershipPort {

    MembershipJpaEntity findMembership(
            Membership.MembershipId membershipId
    );
}
