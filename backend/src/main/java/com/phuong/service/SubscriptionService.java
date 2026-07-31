package com.phuong.service;

import com.phuong.exception.PaymentException;
import com.phuong.exception.SubscriptionException;
import com.phuong.exception.UserException;
import com.phuong.payload.dto.SubscriptionDTO;
import com.phuong.payload.request.SubscribeRequest;
import com.phuong.payload.response.PaymentInitiateResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service interface for subscription operations
 */
public interface SubscriptionService {

    /**
     * Create new subscription with payment
     */
    PaymentInitiateResponse subscribe(SubscribeRequest request) throws SubscriptionException, UserException, PaymentException;

    /**
     * Get active subscription for user
     */
    SubscriptionDTO getUsersActiveSubscription(Long userId) throws SubscriptionException, UserException;

    /**
     * Get all subscriptions for user
     */
    List<SubscriptionDTO> getUserSubscriptions(Long userId) throws SubscriptionException, UserException;

    /**
     * Renew subscription
     */
    PaymentInitiateResponse renewSubscription(Long subscriptionId, SubscribeRequest request) throws SubscriptionException, UserException, PaymentException;

    /**
     * Cancel subscription
     */
    SubscriptionDTO cancelSubscription(Long subscriptionId, String reason) throws SubscriptionException;

    /**
     * Get subscription by ID
     */
    SubscriptionDTO getSubscriptionById(Long id) throws SubscriptionException;

    /**
     * Verify and activate subscription after successful payment
     */
    SubscriptionDTO activateSubscription(Long subscriptionId, Long paymentId) throws SubscriptionException;

    /**
     * Get all active subscriptions (Admin)
     */
    List<SubscriptionDTO> getAllActiveSubscriptions(Pageable pageable);

    /**
     * Deactivate expired subscriptions (Scheduler)
     */
    void deactivateExpiredSubscriptions();

    /**
     * Check if user has valid subscription
     */
    boolean hasValidSubscription(Long userId);
}

