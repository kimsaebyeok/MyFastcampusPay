package org.fastcampuspay.membership.application.port.in;

import org.fastcampuspay.membership.adapter.out.persistence.SpringDataMembershipRepository;
import org.fastcampuspay.membership.common.UseCase;
import org.fastcampuspay.membership.domain.Membership;

@UseCase
public interface RegisterMembershipUseCase {
    Membership registerMembership(RegisterMembershipCommand command);
}
