package org.fastcampuspay.membership.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import org.fastcampuspay.membership.application.port.out.FindMembershipPort;
import org.fastcampuspay.membership.application.port.out.RegisterMembershipPort;
import org.fastcampuspay.membership.common.PersistanceAdapter;
import org.fastcampuspay.membership.domain.Membership;

@PersistanceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort, FindMembershipPort {
    private final SpringDataMembershipRepository membershipRepository;
    @Override
    public MembershipJpaEntity createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp) {
        return membershipRepository.save(
                new MembershipJpaEntity(
                        membershipName.getName(),
                        membershipEmail.getEmail(),
                        membershipAddress.getAddress(),
                        membershipIsValid.isValid(),
                        membershipIsCorp.isCorp()
                )
        );
    }

    @Override
    public MembershipJpaEntity findMembership(Membership.MembershipId membershipId) {
        return membershipRepository.getById(Long.parseLong(membershipId.getMembershipId()));
    }
}
