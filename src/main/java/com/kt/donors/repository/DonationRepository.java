package com.kt.donors.repository;

import com.kt.donors.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
