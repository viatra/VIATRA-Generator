Minimize
	total_cost: 2 h0i0_exists + 2 h0i1_exists + 2 h0i2_exists + 2 h0i3_exists + 2 h0i4_exists + 2 h0i5_exists + 2 h0i6_exists + 2 h0i7_exists + 2 h0i8_exists + 2 h0i9_exists + 4 h1i0_exists + 4 h1i1_exists + 4 h1i2_exists + 4 h1i3_exists + 4 h1i4_exists + 4 h1i5_exists + 4 h1i6_exists + 4 h1i7_exists + 4 h1i8_exists + 4 h1i9_exists + 3 h2i0_exists + 3 h2i1_exists + 3 h2i2_exists + 3 h2i3_exists + 3 h2i4_exists + 3 h2i5_exists + 3 h2i6_exists + 3 h2i7_exists + 3 h2i8_exists + 3 h2i9_exists + 6 h3i0_exists + 6 h3i1_exists + 6 h3i2_exists + 6 h3i3_exists + 6 h3i4_exists + 6 h3i5_exists + 6 h3i6_exists + 6 h3i7_exists + 6 h3i8_exists + 6 h3i9_exists + 2 h4i0_exists + 2 h4i1_exists + 2 h4i2_exists + 2 h4i3_exists + 2 h4i4_exists + 2 h4i5_exists + 2 h4i6_exists + 2 h4i7_exists + 2 h4i8_exists + 2 h4i9_exists + 4 h5i0_exists + 4 h5i1_exists + 4 h5i2_exists + 4 h5i3_exists + 4 h5i4_exists + 4 h5i5_exists + 4 h5i6_exists + 4 h5i7_exists + 4 h5i8_exists + 4 h5i9_exists
Subject To
	r0a0_allocated: r0a0_to_h4i0 + r0a0_to_h4i1 + r0a0_to_h4i2 + r0a0_to_h4i3 + r0a0_to_h4i4 + r0a0_to_h4i5 + r0a0_to_h4i6 + r0a0_to_h4i7 + r0a0_to_h4i8 + r0a0_to_h4i9 + r0a0_to_h5i0 + r0a0_to_h5i1 + r0a0_to_h5i2 + r0a0_to_h5i3 + r0a0_to_h5i4 + r0a0_to_h5i5 + r0a0_to_h5i6 + r0a0_to_h5i7 + r0a0_to_h5i8 + r0a0_to_h5i9 = 1
	r0a0_to_h4i0_exists: h4i0_exists - r0a0_to_h4i0 >= 0
	r0a0_to_h4i1_exists: h4i1_exists - r0a0_to_h4i1 >= 0
	r0a0_to_h4i2_exists: h4i2_exists - r0a0_to_h4i2 >= 0
	r0a0_to_h4i3_exists: h4i3_exists - r0a0_to_h4i3 >= 0
	r0a0_to_h4i4_exists: h4i4_exists - r0a0_to_h4i4 >= 0
	r0a0_to_h4i5_exists: h4i5_exists - r0a0_to_h4i5 >= 0
	r0a0_to_h4i6_exists: h4i6_exists - r0a0_to_h4i6 >= 0
	r0a0_to_h4i7_exists: h4i7_exists - r0a0_to_h4i7 >= 0
	r0a0_to_h4i8_exists: h4i8_exists - r0a0_to_h4i8 >= 0
	r0a0_to_h4i9_exists: h4i9_exists - r0a0_to_h4i9 >= 0
	r0a0_to_h5i0_exists: h5i0_exists - r0a0_to_h5i0 >= 0
	r0a0_to_h5i1_exists: h5i1_exists - r0a0_to_h5i1 >= 0
	r0a0_to_h5i2_exists: h5i2_exists - r0a0_to_h5i2 >= 0
	r0a0_to_h5i3_exists: h5i3_exists - r0a0_to_h5i3 >= 0
	r0a0_to_h5i4_exists: h5i4_exists - r0a0_to_h5i4 >= 0
	r0a0_to_h5i5_exists: h5i5_exists - r0a0_to_h5i5 >= 0
	r0a0_to_h5i6_exists: h5i6_exists - r0a0_to_h5i6 >= 0
	r0a0_to_h5i7_exists: h5i7_exists - r0a0_to_h5i7 >= 0
	r0a0_to_h5i8_exists: h5i8_exists - r0a0_to_h5i8 >= 0
	r0a0_to_h5i9_exists: h5i9_exists - r0a0_to_h5i9 >= 0
	r0a1_allocated: r0a1_to_h4i0 + r0a1_to_h4i1 + r0a1_to_h4i2 + r0a1_to_h4i3 + r0a1_to_h4i4 + r0a1_to_h4i5 + r0a1_to_h4i6 + r0a1_to_h4i7 + r0a1_to_h4i8 + r0a1_to_h4i9 + r0a1_to_h5i0 + r0a1_to_h5i1 + r0a1_to_h5i2 + r0a1_to_h5i3 + r0a1_to_h5i4 + r0a1_to_h5i5 + r0a1_to_h5i6 + r0a1_to_h5i7 + r0a1_to_h5i8 + r0a1_to_h5i9 = 1
	r0a1_to_h4i0_exists: h4i0_exists - r0a1_to_h4i0 >= 0
	r0a1_to_h4i1_exists: h4i1_exists - r0a1_to_h4i1 >= 0
	r0a1_to_h4i2_exists: h4i2_exists - r0a1_to_h4i2 >= 0
	r0a1_to_h4i3_exists: h4i3_exists - r0a1_to_h4i3 >= 0
	r0a1_to_h4i4_exists: h4i4_exists - r0a1_to_h4i4 >= 0
	r0a1_to_h4i5_exists: h4i5_exists - r0a1_to_h4i5 >= 0
	r0a1_to_h4i6_exists: h4i6_exists - r0a1_to_h4i6 >= 0
	r0a1_to_h4i7_exists: h4i7_exists - r0a1_to_h4i7 >= 0
	r0a1_to_h4i8_exists: h4i8_exists - r0a1_to_h4i8 >= 0
	r0a1_to_h4i9_exists: h4i9_exists - r0a1_to_h4i9 >= 0
	r0a1_to_h5i0_exists: h5i0_exists - r0a1_to_h5i0 >= 0
	r0a1_to_h5i1_exists: h5i1_exists - r0a1_to_h5i1 >= 0
	r0a1_to_h5i2_exists: h5i2_exists - r0a1_to_h5i2 >= 0
	r0a1_to_h5i3_exists: h5i3_exists - r0a1_to_h5i3 >= 0
	r0a1_to_h5i4_exists: h5i4_exists - r0a1_to_h5i4 >= 0
	r0a1_to_h5i5_exists: h5i5_exists - r0a1_to_h5i5 >= 0
	r0a1_to_h5i6_exists: h5i6_exists - r0a1_to_h5i6 >= 0
	r0a1_to_h5i7_exists: h5i7_exists - r0a1_to_h5i7 >= 0
	r0a1_to_h5i8_exists: h5i8_exists - r0a1_to_h5i8 >= 0
	r0a1_to_h5i9_exists: h5i9_exists - r0a1_to_h5i9 >= 0
	r0a2_allocated: r0a2_to_h4i0 + r0a2_to_h4i1 + r0a2_to_h4i2 + r0a2_to_h4i3 + r0a2_to_h4i4 + r0a2_to_h4i5 + r0a2_to_h4i6 + r0a2_to_h4i7 + r0a2_to_h4i8 + r0a2_to_h4i9 + r0a2_to_h5i0 + r0a2_to_h5i1 + r0a2_to_h5i2 + r0a2_to_h5i3 + r0a2_to_h5i4 + r0a2_to_h5i5 + r0a2_to_h5i6 + r0a2_to_h5i7 + r0a2_to_h5i8 + r0a2_to_h5i9 = 1
	r0a2_to_h4i0_exists: h4i0_exists - r0a2_to_h4i0 >= 0
	r0a2_to_h4i1_exists: h4i1_exists - r0a2_to_h4i1 >= 0
	r0a2_to_h4i2_exists: h4i2_exists - r0a2_to_h4i2 >= 0
	r0a2_to_h4i3_exists: h4i3_exists - r0a2_to_h4i3 >= 0
	r0a2_to_h4i4_exists: h4i4_exists - r0a2_to_h4i4 >= 0
	r0a2_to_h4i5_exists: h4i5_exists - r0a2_to_h4i5 >= 0
	r0a2_to_h4i6_exists: h4i6_exists - r0a2_to_h4i6 >= 0
	r0a2_to_h4i7_exists: h4i7_exists - r0a2_to_h4i7 >= 0
	r0a2_to_h4i8_exists: h4i8_exists - r0a2_to_h4i8 >= 0
	r0a2_to_h4i9_exists: h4i9_exists - r0a2_to_h4i9 >= 0
	r0a2_to_h5i0_exists: h5i0_exists - r0a2_to_h5i0 >= 0
	r0a2_to_h5i1_exists: h5i1_exists - r0a2_to_h5i1 >= 0
	r0a2_to_h5i2_exists: h5i2_exists - r0a2_to_h5i2 >= 0
	r0a2_to_h5i3_exists: h5i3_exists - r0a2_to_h5i3 >= 0
	r0a2_to_h5i4_exists: h5i4_exists - r0a2_to_h5i4 >= 0
	r0a2_to_h5i5_exists: h5i5_exists - r0a2_to_h5i5 >= 0
	r0a2_to_h5i6_exists: h5i6_exists - r0a2_to_h5i6 >= 0
	r0a2_to_h5i7_exists: h5i7_exists - r0a2_to_h5i7 >= 0
	r0a2_to_h5i8_exists: h5i8_exists - r0a2_to_h5i8 >= 0
	r0a2_to_h5i9_exists: h5i9_exists - r0a2_to_h5i9 >= 0
	r0a3_allocated: r0a3_to_h4i0 + r0a3_to_h4i1 + r0a3_to_h4i2 + r0a3_to_h4i3 + r0a3_to_h4i4 + r0a3_to_h4i5 + r0a3_to_h4i6 + r0a3_to_h4i7 + r0a3_to_h4i8 + r0a3_to_h4i9 + r0a3_to_h5i0 + r0a3_to_h5i1 + r0a3_to_h5i2 + r0a3_to_h5i3 + r0a3_to_h5i4 + r0a3_to_h5i5 + r0a3_to_h5i6 + r0a3_to_h5i7 + r0a3_to_h5i8 + r0a3_to_h5i9 = 1
	r0a3_to_h4i0_exists: h4i0_exists - r0a3_to_h4i0 >= 0
	r0a3_to_h4i1_exists: h4i1_exists - r0a3_to_h4i1 >= 0
	r0a3_to_h4i2_exists: h4i2_exists - r0a3_to_h4i2 >= 0
	r0a3_to_h4i3_exists: h4i3_exists - r0a3_to_h4i3 >= 0
	r0a3_to_h4i4_exists: h4i4_exists - r0a3_to_h4i4 >= 0
	r0a3_to_h4i5_exists: h4i5_exists - r0a3_to_h4i5 >= 0
	r0a3_to_h4i6_exists: h4i6_exists - r0a3_to_h4i6 >= 0
	r0a3_to_h4i7_exists: h4i7_exists - r0a3_to_h4i7 >= 0
	r0a3_to_h4i8_exists: h4i8_exists - r0a3_to_h4i8 >= 0
	r0a3_to_h4i9_exists: h4i9_exists - r0a3_to_h4i9 >= 0
	r0a3_to_h5i0_exists: h5i0_exists - r0a3_to_h5i0 >= 0
	r0a3_to_h5i1_exists: h5i1_exists - r0a3_to_h5i1 >= 0
	r0a3_to_h5i2_exists: h5i2_exists - r0a3_to_h5i2 >= 0
	r0a3_to_h5i3_exists: h5i3_exists - r0a3_to_h5i3 >= 0
	r0a3_to_h5i4_exists: h5i4_exists - r0a3_to_h5i4 >= 0
	r0a3_to_h5i5_exists: h5i5_exists - r0a3_to_h5i5 >= 0
	r0a3_to_h5i6_exists: h5i6_exists - r0a3_to_h5i6 >= 0
	r0a3_to_h5i7_exists: h5i7_exists - r0a3_to_h5i7 >= 0
	r0a3_to_h5i8_exists: h5i8_exists - r0a3_to_h5i8 >= 0
	r0a3_to_h5i9_exists: h5i9_exists - r0a3_to_h5i9 >= 0
	r1a0_allocated: r1a0_to_h0i0 + r1a0_to_h0i1 + r1a0_to_h0i2 + r1a0_to_h0i3 + r1a0_to_h0i4 + r1a0_to_h0i5 + r1a0_to_h0i6 + r1a0_to_h0i7 + r1a0_to_h0i8 + r1a0_to_h0i9 + r1a0_to_h1i0 + r1a0_to_h1i1 + r1a0_to_h1i2 + r1a0_to_h1i3 + r1a0_to_h1i4 + r1a0_to_h1i5 + r1a0_to_h1i6 + r1a0_to_h1i7 + r1a0_to_h1i8 + r1a0_to_h1i9 + r1a0_to_h2i0 + r1a0_to_h2i1 + r1a0_to_h2i2 + r1a0_to_h2i3 + r1a0_to_h2i4 + r1a0_to_h2i5 + r1a0_to_h2i6 + r1a0_to_h2i7 + r1a0_to_h2i8 + r1a0_to_h2i9 + r1a0_to_h3i0 + r1a0_to_h3i1 + r1a0_to_h3i2 + r1a0_to_h3i3 + r1a0_to_h3i4 + r1a0_to_h3i5 + r1a0_to_h3i6 + r1a0_to_h3i7 + r1a0_to_h3i8 + r1a0_to_h3i9 + r1a0_to_h4i0 + r1a0_to_h4i1 + r1a0_to_h4i2 + r1a0_to_h4i3 + r1a0_to_h4i4 + r1a0_to_h4i5 + r1a0_to_h4i6 + r1a0_to_h4i7 + r1a0_to_h4i8 + r1a0_to_h4i9 + r1a0_to_h5i0 + r1a0_to_h5i1 + r1a0_to_h5i2 + r1a0_to_h5i3 + r1a0_to_h5i4 + r1a0_to_h5i5 + r1a0_to_h5i6 + r1a0_to_h5i7 + r1a0_to_h5i8 + r1a0_to_h5i9 = 1
	r1a0_to_h0i0_exists: h0i0_exists - r1a0_to_h0i0 >= 0
	r1a0_to_h0i1_exists: h0i1_exists - r1a0_to_h0i1 >= 0
	r1a0_to_h0i2_exists: h0i2_exists - r1a0_to_h0i2 >= 0
	r1a0_to_h0i3_exists: h0i3_exists - r1a0_to_h0i3 >= 0
	r1a0_to_h0i4_exists: h0i4_exists - r1a0_to_h0i4 >= 0
	r1a0_to_h0i5_exists: h0i5_exists - r1a0_to_h0i5 >= 0
	r1a0_to_h0i6_exists: h0i6_exists - r1a0_to_h0i6 >= 0
	r1a0_to_h0i7_exists: h0i7_exists - r1a0_to_h0i7 >= 0
	r1a0_to_h0i8_exists: h0i8_exists - r1a0_to_h0i8 >= 0
	r1a0_to_h0i9_exists: h0i9_exists - r1a0_to_h0i9 >= 0
	r1a0_to_h1i0_exists: h1i0_exists - r1a0_to_h1i0 >= 0
	r1a0_to_h1i1_exists: h1i1_exists - r1a0_to_h1i1 >= 0
	r1a0_to_h1i2_exists: h1i2_exists - r1a0_to_h1i2 >= 0
	r1a0_to_h1i3_exists: h1i3_exists - r1a0_to_h1i3 >= 0
	r1a0_to_h1i4_exists: h1i4_exists - r1a0_to_h1i4 >= 0
	r1a0_to_h1i5_exists: h1i5_exists - r1a0_to_h1i5 >= 0
	r1a0_to_h1i6_exists: h1i6_exists - r1a0_to_h1i6 >= 0
	r1a0_to_h1i7_exists: h1i7_exists - r1a0_to_h1i7 >= 0
	r1a0_to_h1i8_exists: h1i8_exists - r1a0_to_h1i8 >= 0
	r1a0_to_h1i9_exists: h1i9_exists - r1a0_to_h1i9 >= 0
	r1a0_to_h2i0_exists: h2i0_exists - r1a0_to_h2i0 >= 0
	r1a0_to_h2i1_exists: h2i1_exists - r1a0_to_h2i1 >= 0
	r1a0_to_h2i2_exists: h2i2_exists - r1a0_to_h2i2 >= 0
	r1a0_to_h2i3_exists: h2i3_exists - r1a0_to_h2i3 >= 0
	r1a0_to_h2i4_exists: h2i4_exists - r1a0_to_h2i4 >= 0
	r1a0_to_h2i5_exists: h2i5_exists - r1a0_to_h2i5 >= 0
	r1a0_to_h2i6_exists: h2i6_exists - r1a0_to_h2i6 >= 0
	r1a0_to_h2i7_exists: h2i7_exists - r1a0_to_h2i7 >= 0
	r1a0_to_h2i8_exists: h2i8_exists - r1a0_to_h2i8 >= 0
	r1a0_to_h2i9_exists: h2i9_exists - r1a0_to_h2i9 >= 0
	r1a0_to_h3i0_exists: h3i0_exists - r1a0_to_h3i0 >= 0
	r1a0_to_h3i1_exists: h3i1_exists - r1a0_to_h3i1 >= 0
	r1a0_to_h3i2_exists: h3i2_exists - r1a0_to_h3i2 >= 0
	r1a0_to_h3i3_exists: h3i3_exists - r1a0_to_h3i3 >= 0
	r1a0_to_h3i4_exists: h3i4_exists - r1a0_to_h3i4 >= 0
	r1a0_to_h3i5_exists: h3i5_exists - r1a0_to_h3i5 >= 0
	r1a0_to_h3i6_exists: h3i6_exists - r1a0_to_h3i6 >= 0
	r1a0_to_h3i7_exists: h3i7_exists - r1a0_to_h3i7 >= 0
	r1a0_to_h3i8_exists: h3i8_exists - r1a0_to_h3i8 >= 0
	r1a0_to_h3i9_exists: h3i9_exists - r1a0_to_h3i9 >= 0
	r1a0_to_h4i0_exists: h4i0_exists - r1a0_to_h4i0 >= 0
	r1a0_to_h4i1_exists: h4i1_exists - r1a0_to_h4i1 >= 0
	r1a0_to_h4i2_exists: h4i2_exists - r1a0_to_h4i2 >= 0
	r1a0_to_h4i3_exists: h4i3_exists - r1a0_to_h4i3 >= 0
	r1a0_to_h4i4_exists: h4i4_exists - r1a0_to_h4i4 >= 0
	r1a0_to_h4i5_exists: h4i5_exists - r1a0_to_h4i5 >= 0
	r1a0_to_h4i6_exists: h4i6_exists - r1a0_to_h4i6 >= 0
	r1a0_to_h4i7_exists: h4i7_exists - r1a0_to_h4i7 >= 0
	r1a0_to_h4i8_exists: h4i8_exists - r1a0_to_h4i8 >= 0
	r1a0_to_h4i9_exists: h4i9_exists - r1a0_to_h4i9 >= 0
	r1a0_to_h5i0_exists: h5i0_exists - r1a0_to_h5i0 >= 0
	r1a0_to_h5i1_exists: h5i1_exists - r1a0_to_h5i1 >= 0
	r1a0_to_h5i2_exists: h5i2_exists - r1a0_to_h5i2 >= 0
	r1a0_to_h5i3_exists: h5i3_exists - r1a0_to_h5i3 >= 0
	r1a0_to_h5i4_exists: h5i4_exists - r1a0_to_h5i4 >= 0
	r1a0_to_h5i5_exists: h5i5_exists - r1a0_to_h5i5 >= 0
	r1a0_to_h5i6_exists: h5i6_exists - r1a0_to_h5i6 >= 0
	r1a0_to_h5i7_exists: h5i7_exists - r1a0_to_h5i7 >= 0
	r1a0_to_h5i8_exists: h5i8_exists - r1a0_to_h5i8 >= 0
	r1a0_to_h5i9_exists: h5i9_exists - r1a0_to_h5i9 >= 0
	r1a1_allocated: r1a1_to_h0i0 + r1a1_to_h0i1 + r1a1_to_h0i2 + r1a1_to_h0i3 + r1a1_to_h0i4 + r1a1_to_h0i5 + r1a1_to_h0i6 + r1a1_to_h0i7 + r1a1_to_h0i8 + r1a1_to_h0i9 + r1a1_to_h1i0 + r1a1_to_h1i1 + r1a1_to_h1i2 + r1a1_to_h1i3 + r1a1_to_h1i4 + r1a1_to_h1i5 + r1a1_to_h1i6 + r1a1_to_h1i7 + r1a1_to_h1i8 + r1a1_to_h1i9 + r1a1_to_h2i0 + r1a1_to_h2i1 + r1a1_to_h2i2 + r1a1_to_h2i3 + r1a1_to_h2i4 + r1a1_to_h2i5 + r1a1_to_h2i6 + r1a1_to_h2i7 + r1a1_to_h2i8 + r1a1_to_h2i9 + r1a1_to_h3i0 + r1a1_to_h3i1 + r1a1_to_h3i2 + r1a1_to_h3i3 + r1a1_to_h3i4 + r1a1_to_h3i5 + r1a1_to_h3i6 + r1a1_to_h3i7 + r1a1_to_h3i8 + r1a1_to_h3i9 + r1a1_to_h4i0 + r1a1_to_h4i1 + r1a1_to_h4i2 + r1a1_to_h4i3 + r1a1_to_h4i4 + r1a1_to_h4i5 + r1a1_to_h4i6 + r1a1_to_h4i7 + r1a1_to_h4i8 + r1a1_to_h4i9 + r1a1_to_h5i0 + r1a1_to_h5i1 + r1a1_to_h5i2 + r1a1_to_h5i3 + r1a1_to_h5i4 + r1a1_to_h5i5 + r1a1_to_h5i6 + r1a1_to_h5i7 + r1a1_to_h5i8 + r1a1_to_h5i9 = 1
	r1a1_to_h0i0_exists: h0i0_exists - r1a1_to_h0i0 >= 0
	r1a1_to_h0i1_exists: h0i1_exists - r1a1_to_h0i1 >= 0
	r1a1_to_h0i2_exists: h0i2_exists - r1a1_to_h0i2 >= 0
	r1a1_to_h0i3_exists: h0i3_exists - r1a1_to_h0i3 >= 0
	r1a1_to_h0i4_exists: h0i4_exists - r1a1_to_h0i4 >= 0
	r1a1_to_h0i5_exists: h0i5_exists - r1a1_to_h0i5 >= 0
	r1a1_to_h0i6_exists: h0i6_exists - r1a1_to_h0i6 >= 0
	r1a1_to_h0i7_exists: h0i7_exists - r1a1_to_h0i7 >= 0
	r1a1_to_h0i8_exists: h0i8_exists - r1a1_to_h0i8 >= 0
	r1a1_to_h0i9_exists: h0i9_exists - r1a1_to_h0i9 >= 0
	r1a1_to_h1i0_exists: h1i0_exists - r1a1_to_h1i0 >= 0
	r1a1_to_h1i1_exists: h1i1_exists - r1a1_to_h1i1 >= 0
	r1a1_to_h1i2_exists: h1i2_exists - r1a1_to_h1i2 >= 0
	r1a1_to_h1i3_exists: h1i3_exists - r1a1_to_h1i3 >= 0
	r1a1_to_h1i4_exists: h1i4_exists - r1a1_to_h1i4 >= 0
	r1a1_to_h1i5_exists: h1i5_exists - r1a1_to_h1i5 >= 0
	r1a1_to_h1i6_exists: h1i6_exists - r1a1_to_h1i6 >= 0
	r1a1_to_h1i7_exists: h1i7_exists - r1a1_to_h1i7 >= 0
	r1a1_to_h1i8_exists: h1i8_exists - r1a1_to_h1i8 >= 0
	r1a1_to_h1i9_exists: h1i9_exists - r1a1_to_h1i9 >= 0
	r1a1_to_h2i0_exists: h2i0_exists - r1a1_to_h2i0 >= 0
	r1a1_to_h2i1_exists: h2i1_exists - r1a1_to_h2i1 >= 0
	r1a1_to_h2i2_exists: h2i2_exists - r1a1_to_h2i2 >= 0
	r1a1_to_h2i3_exists: h2i3_exists - r1a1_to_h2i3 >= 0
	r1a1_to_h2i4_exists: h2i4_exists - r1a1_to_h2i4 >= 0
	r1a1_to_h2i5_exists: h2i5_exists - r1a1_to_h2i5 >= 0
	r1a1_to_h2i6_exists: h2i6_exists - r1a1_to_h2i6 >= 0
	r1a1_to_h2i7_exists: h2i7_exists - r1a1_to_h2i7 >= 0
	r1a1_to_h2i8_exists: h2i8_exists - r1a1_to_h2i8 >= 0
	r1a1_to_h2i9_exists: h2i9_exists - r1a1_to_h2i9 >= 0
	r1a1_to_h3i0_exists: h3i0_exists - r1a1_to_h3i0 >= 0
	r1a1_to_h3i1_exists: h3i1_exists - r1a1_to_h3i1 >= 0
	r1a1_to_h3i2_exists: h3i2_exists - r1a1_to_h3i2 >= 0
	r1a1_to_h3i3_exists: h3i3_exists - r1a1_to_h3i3 >= 0
	r1a1_to_h3i4_exists: h3i4_exists - r1a1_to_h3i4 >= 0
	r1a1_to_h3i5_exists: h3i5_exists - r1a1_to_h3i5 >= 0
	r1a1_to_h3i6_exists: h3i6_exists - r1a1_to_h3i6 >= 0
	r1a1_to_h3i7_exists: h3i7_exists - r1a1_to_h3i7 >= 0
	r1a1_to_h3i8_exists: h3i8_exists - r1a1_to_h3i8 >= 0
	r1a1_to_h3i9_exists: h3i9_exists - r1a1_to_h3i9 >= 0
	r1a1_to_h4i0_exists: h4i0_exists - r1a1_to_h4i0 >= 0
	r1a1_to_h4i1_exists: h4i1_exists - r1a1_to_h4i1 >= 0
	r1a1_to_h4i2_exists: h4i2_exists - r1a1_to_h4i2 >= 0
	r1a1_to_h4i3_exists: h4i3_exists - r1a1_to_h4i3 >= 0
	r1a1_to_h4i4_exists: h4i4_exists - r1a1_to_h4i4 >= 0
	r1a1_to_h4i5_exists: h4i5_exists - r1a1_to_h4i5 >= 0
	r1a1_to_h4i6_exists: h4i6_exists - r1a1_to_h4i6 >= 0
	r1a1_to_h4i7_exists: h4i7_exists - r1a1_to_h4i7 >= 0
	r1a1_to_h4i8_exists: h4i8_exists - r1a1_to_h4i8 >= 0
	r1a1_to_h4i9_exists: h4i9_exists - r1a1_to_h4i9 >= 0
	r1a1_to_h5i0_exists: h5i0_exists - r1a1_to_h5i0 >= 0
	r1a1_to_h5i1_exists: h5i1_exists - r1a1_to_h5i1 >= 0
	r1a1_to_h5i2_exists: h5i2_exists - r1a1_to_h5i2 >= 0
	r1a1_to_h5i3_exists: h5i3_exists - r1a1_to_h5i3 >= 0
	r1a1_to_h5i4_exists: h5i4_exists - r1a1_to_h5i4 >= 0
	r1a1_to_h5i5_exists: h5i5_exists - r1a1_to_h5i5 >= 0
	r1a1_to_h5i6_exists: h5i6_exists - r1a1_to_h5i6 >= 0
	r1a1_to_h5i7_exists: h5i7_exists - r1a1_to_h5i7 >= 0
	r1a1_to_h5i8_exists: h5i8_exists - r1a1_to_h5i8 >= 0
	r1a1_to_h5i9_exists: h5i9_exists - r1a1_to_h5i9 >= 0
	r1a2_allocated: r1a2_to_h0i0 + r1a2_to_h0i1 + r1a2_to_h0i2 + r1a2_to_h0i3 + r1a2_to_h0i4 + r1a2_to_h0i5 + r1a2_to_h0i6 + r1a2_to_h0i7 + r1a2_to_h0i8 + r1a2_to_h0i9 + r1a2_to_h1i0 + r1a2_to_h1i1 + r1a2_to_h1i2 + r1a2_to_h1i3 + r1a2_to_h1i4 + r1a2_to_h1i5 + r1a2_to_h1i6 + r1a2_to_h1i7 + r1a2_to_h1i8 + r1a2_to_h1i9 + r1a2_to_h2i0 + r1a2_to_h2i1 + r1a2_to_h2i2 + r1a2_to_h2i3 + r1a2_to_h2i4 + r1a2_to_h2i5 + r1a2_to_h2i6 + r1a2_to_h2i7 + r1a2_to_h2i8 + r1a2_to_h2i9 + r1a2_to_h3i0 + r1a2_to_h3i1 + r1a2_to_h3i2 + r1a2_to_h3i3 + r1a2_to_h3i4 + r1a2_to_h3i5 + r1a2_to_h3i6 + r1a2_to_h3i7 + r1a2_to_h3i8 + r1a2_to_h3i9 + r1a2_to_h4i0 + r1a2_to_h4i1 + r1a2_to_h4i2 + r1a2_to_h4i3 + r1a2_to_h4i4 + r1a2_to_h4i5 + r1a2_to_h4i6 + r1a2_to_h4i7 + r1a2_to_h4i8 + r1a2_to_h4i9 + r1a2_to_h5i0 + r1a2_to_h5i1 + r1a2_to_h5i2 + r1a2_to_h5i3 + r1a2_to_h5i4 + r1a2_to_h5i5 + r1a2_to_h5i6 + r1a2_to_h5i7 + r1a2_to_h5i8 + r1a2_to_h5i9 = 1
	r1a2_to_h0i0_exists: h0i0_exists - r1a2_to_h0i0 >= 0
	r1a2_to_h0i1_exists: h0i1_exists - r1a2_to_h0i1 >= 0
	r1a2_to_h0i2_exists: h0i2_exists - r1a2_to_h0i2 >= 0
	r1a2_to_h0i3_exists: h0i3_exists - r1a2_to_h0i3 >= 0
	r1a2_to_h0i4_exists: h0i4_exists - r1a2_to_h0i4 >= 0
	r1a2_to_h0i5_exists: h0i5_exists - r1a2_to_h0i5 >= 0
	r1a2_to_h0i6_exists: h0i6_exists - r1a2_to_h0i6 >= 0
	r1a2_to_h0i7_exists: h0i7_exists - r1a2_to_h0i7 >= 0
	r1a2_to_h0i8_exists: h0i8_exists - r1a2_to_h0i8 >= 0
	r1a2_to_h0i9_exists: h0i9_exists - r1a2_to_h0i9 >= 0
	r1a2_to_h1i0_exists: h1i0_exists - r1a2_to_h1i0 >= 0
	r1a2_to_h1i1_exists: h1i1_exists - r1a2_to_h1i1 >= 0
	r1a2_to_h1i2_exists: h1i2_exists - r1a2_to_h1i2 >= 0
	r1a2_to_h1i3_exists: h1i3_exists - r1a2_to_h1i3 >= 0
	r1a2_to_h1i4_exists: h1i4_exists - r1a2_to_h1i4 >= 0
	r1a2_to_h1i5_exists: h1i5_exists - r1a2_to_h1i5 >= 0
	r1a2_to_h1i6_exists: h1i6_exists - r1a2_to_h1i6 >= 0
	r1a2_to_h1i7_exists: h1i7_exists - r1a2_to_h1i7 >= 0
	r1a2_to_h1i8_exists: h1i8_exists - r1a2_to_h1i8 >= 0
	r1a2_to_h1i9_exists: h1i9_exists - r1a2_to_h1i9 >= 0
	r1a2_to_h2i0_exists: h2i0_exists - r1a2_to_h2i0 >= 0
	r1a2_to_h2i1_exists: h2i1_exists - r1a2_to_h2i1 >= 0
	r1a2_to_h2i2_exists: h2i2_exists - r1a2_to_h2i2 >= 0
	r1a2_to_h2i3_exists: h2i3_exists - r1a2_to_h2i3 >= 0
	r1a2_to_h2i4_exists: h2i4_exists - r1a2_to_h2i4 >= 0
	r1a2_to_h2i5_exists: h2i5_exists - r1a2_to_h2i5 >= 0
	r1a2_to_h2i6_exists: h2i6_exists - r1a2_to_h2i6 >= 0
	r1a2_to_h2i7_exists: h2i7_exists - r1a2_to_h2i7 >= 0
	r1a2_to_h2i8_exists: h2i8_exists - r1a2_to_h2i8 >= 0
	r1a2_to_h2i9_exists: h2i9_exists - r1a2_to_h2i9 >= 0
	r1a2_to_h3i0_exists: h3i0_exists - r1a2_to_h3i0 >= 0
	r1a2_to_h3i1_exists: h3i1_exists - r1a2_to_h3i1 >= 0
	r1a2_to_h3i2_exists: h3i2_exists - r1a2_to_h3i2 >= 0
	r1a2_to_h3i3_exists: h3i3_exists - r1a2_to_h3i3 >= 0
	r1a2_to_h3i4_exists: h3i4_exists - r1a2_to_h3i4 >= 0
	r1a2_to_h3i5_exists: h3i5_exists - r1a2_to_h3i5 >= 0
	r1a2_to_h3i6_exists: h3i6_exists - r1a2_to_h3i6 >= 0
	r1a2_to_h3i7_exists: h3i7_exists - r1a2_to_h3i7 >= 0
	r1a2_to_h3i8_exists: h3i8_exists - r1a2_to_h3i8 >= 0
	r1a2_to_h3i9_exists: h3i9_exists - r1a2_to_h3i9 >= 0
	r1a2_to_h4i0_exists: h4i0_exists - r1a2_to_h4i0 >= 0
	r1a2_to_h4i1_exists: h4i1_exists - r1a2_to_h4i1 >= 0
	r1a2_to_h4i2_exists: h4i2_exists - r1a2_to_h4i2 >= 0
	r1a2_to_h4i3_exists: h4i3_exists - r1a2_to_h4i3 >= 0
	r1a2_to_h4i4_exists: h4i4_exists - r1a2_to_h4i4 >= 0
	r1a2_to_h4i5_exists: h4i5_exists - r1a2_to_h4i5 >= 0
	r1a2_to_h4i6_exists: h4i6_exists - r1a2_to_h4i6 >= 0
	r1a2_to_h4i7_exists: h4i7_exists - r1a2_to_h4i7 >= 0
	r1a2_to_h4i8_exists: h4i8_exists - r1a2_to_h4i8 >= 0
	r1a2_to_h4i9_exists: h4i9_exists - r1a2_to_h4i9 >= 0
	r1a2_to_h5i0_exists: h5i0_exists - r1a2_to_h5i0 >= 0
	r1a2_to_h5i1_exists: h5i1_exists - r1a2_to_h5i1 >= 0
	r1a2_to_h5i2_exists: h5i2_exists - r1a2_to_h5i2 >= 0
	r1a2_to_h5i3_exists: h5i3_exists - r1a2_to_h5i3 >= 0
	r1a2_to_h5i4_exists: h5i4_exists - r1a2_to_h5i4 >= 0
	r1a2_to_h5i5_exists: h5i5_exists - r1a2_to_h5i5 >= 0
	r1a2_to_h5i6_exists: h5i6_exists - r1a2_to_h5i6 >= 0
	r1a2_to_h5i7_exists: h5i7_exists - r1a2_to_h5i7 >= 0
	r1a2_to_h5i8_exists: h5i8_exists - r1a2_to_h5i8 >= 0
	r1a2_to_h5i9_exists: h5i9_exists - r1a2_to_h5i9 >= 0
	r2a0_allocated: r2a0_to_h0i0 + r2a0_to_h0i1 + r2a0_to_h0i2 + r2a0_to_h0i3 + r2a0_to_h0i4 + r2a0_to_h0i5 + r2a0_to_h0i6 + r2a0_to_h0i7 + r2a0_to_h0i8 + r2a0_to_h0i9 + r2a0_to_h1i0 + r2a0_to_h1i1 + r2a0_to_h1i2 + r2a0_to_h1i3 + r2a0_to_h1i4 + r2a0_to_h1i5 + r2a0_to_h1i6 + r2a0_to_h1i7 + r2a0_to_h1i8 + r2a0_to_h1i9 + r2a0_to_h2i0 + r2a0_to_h2i1 + r2a0_to_h2i2 + r2a0_to_h2i3 + r2a0_to_h2i4 + r2a0_to_h2i5 + r2a0_to_h2i6 + r2a0_to_h2i7 + r2a0_to_h2i8 + r2a0_to_h2i9 + r2a0_to_h3i0 + r2a0_to_h3i1 + r2a0_to_h3i2 + r2a0_to_h3i3 + r2a0_to_h3i4 + r2a0_to_h3i5 + r2a0_to_h3i6 + r2a0_to_h3i7 + r2a0_to_h3i8 + r2a0_to_h3i9 + r2a0_to_h4i0 + r2a0_to_h4i1 + r2a0_to_h4i2 + r2a0_to_h4i3 + r2a0_to_h4i4 + r2a0_to_h4i5 + r2a0_to_h4i6 + r2a0_to_h4i7 + r2a0_to_h4i8 + r2a0_to_h4i9 + r2a0_to_h5i0 + r2a0_to_h5i1 + r2a0_to_h5i2 + r2a0_to_h5i3 + r2a0_to_h5i4 + r2a0_to_h5i5 + r2a0_to_h5i6 + r2a0_to_h5i7 + r2a0_to_h5i8 + r2a0_to_h5i9 = 1
	r2a0_to_h0i0_exists: h0i0_exists - r2a0_to_h0i0 >= 0
	r2a0_to_h0i1_exists: h0i1_exists - r2a0_to_h0i1 >= 0
	r2a0_to_h0i2_exists: h0i2_exists - r2a0_to_h0i2 >= 0
	r2a0_to_h0i3_exists: h0i3_exists - r2a0_to_h0i3 >= 0
	r2a0_to_h0i4_exists: h0i4_exists - r2a0_to_h0i4 >= 0
	r2a0_to_h0i5_exists: h0i5_exists - r2a0_to_h0i5 >= 0
	r2a0_to_h0i6_exists: h0i6_exists - r2a0_to_h0i6 >= 0
	r2a0_to_h0i7_exists: h0i7_exists - r2a0_to_h0i7 >= 0
	r2a0_to_h0i8_exists: h0i8_exists - r2a0_to_h0i8 >= 0
	r2a0_to_h0i9_exists: h0i9_exists - r2a0_to_h0i9 >= 0
	r2a0_to_h1i0_exists: h1i0_exists - r2a0_to_h1i0 >= 0
	r2a0_to_h1i1_exists: h1i1_exists - r2a0_to_h1i1 >= 0
	r2a0_to_h1i2_exists: h1i2_exists - r2a0_to_h1i2 >= 0
	r2a0_to_h1i3_exists: h1i3_exists - r2a0_to_h1i3 >= 0
	r2a0_to_h1i4_exists: h1i4_exists - r2a0_to_h1i4 >= 0
	r2a0_to_h1i5_exists: h1i5_exists - r2a0_to_h1i5 >= 0
	r2a0_to_h1i6_exists: h1i6_exists - r2a0_to_h1i6 >= 0
	r2a0_to_h1i7_exists: h1i7_exists - r2a0_to_h1i7 >= 0
	r2a0_to_h1i8_exists: h1i8_exists - r2a0_to_h1i8 >= 0
	r2a0_to_h1i9_exists: h1i9_exists - r2a0_to_h1i9 >= 0
	r2a0_to_h2i0_exists: h2i0_exists - r2a0_to_h2i0 >= 0
	r2a0_to_h2i1_exists: h2i1_exists - r2a0_to_h2i1 >= 0
	r2a0_to_h2i2_exists: h2i2_exists - r2a0_to_h2i2 >= 0
	r2a0_to_h2i3_exists: h2i3_exists - r2a0_to_h2i3 >= 0
	r2a0_to_h2i4_exists: h2i4_exists - r2a0_to_h2i4 >= 0
	r2a0_to_h2i5_exists: h2i5_exists - r2a0_to_h2i5 >= 0
	r2a0_to_h2i6_exists: h2i6_exists - r2a0_to_h2i6 >= 0
	r2a0_to_h2i7_exists: h2i7_exists - r2a0_to_h2i7 >= 0
	r2a0_to_h2i8_exists: h2i8_exists - r2a0_to_h2i8 >= 0
	r2a0_to_h2i9_exists: h2i9_exists - r2a0_to_h2i9 >= 0
	r2a0_to_h3i0_exists: h3i0_exists - r2a0_to_h3i0 >= 0
	r2a0_to_h3i1_exists: h3i1_exists - r2a0_to_h3i1 >= 0
	r2a0_to_h3i2_exists: h3i2_exists - r2a0_to_h3i2 >= 0
	r2a0_to_h3i3_exists: h3i3_exists - r2a0_to_h3i3 >= 0
	r2a0_to_h3i4_exists: h3i4_exists - r2a0_to_h3i4 >= 0
	r2a0_to_h3i5_exists: h3i5_exists - r2a0_to_h3i5 >= 0
	r2a0_to_h3i6_exists: h3i6_exists - r2a0_to_h3i6 >= 0
	r2a0_to_h3i7_exists: h3i7_exists - r2a0_to_h3i7 >= 0
	r2a0_to_h3i8_exists: h3i8_exists - r2a0_to_h3i8 >= 0
	r2a0_to_h3i9_exists: h3i9_exists - r2a0_to_h3i9 >= 0
	r2a0_to_h4i0_exists: h4i0_exists - r2a0_to_h4i0 >= 0
	r2a0_to_h4i1_exists: h4i1_exists - r2a0_to_h4i1 >= 0
	r2a0_to_h4i2_exists: h4i2_exists - r2a0_to_h4i2 >= 0
	r2a0_to_h4i3_exists: h4i3_exists - r2a0_to_h4i3 >= 0
	r2a0_to_h4i4_exists: h4i4_exists - r2a0_to_h4i4 >= 0
	r2a0_to_h4i5_exists: h4i5_exists - r2a0_to_h4i5 >= 0
	r2a0_to_h4i6_exists: h4i6_exists - r2a0_to_h4i6 >= 0
	r2a0_to_h4i7_exists: h4i7_exists - r2a0_to_h4i7 >= 0
	r2a0_to_h4i8_exists: h4i8_exists - r2a0_to_h4i8 >= 0
	r2a0_to_h4i9_exists: h4i9_exists - r2a0_to_h4i9 >= 0
	r2a0_to_h5i0_exists: h5i0_exists - r2a0_to_h5i0 >= 0
	r2a0_to_h5i1_exists: h5i1_exists - r2a0_to_h5i1 >= 0
	r2a0_to_h5i2_exists: h5i2_exists - r2a0_to_h5i2 >= 0
	r2a0_to_h5i3_exists: h5i3_exists - r2a0_to_h5i3 >= 0
	r2a0_to_h5i4_exists: h5i4_exists - r2a0_to_h5i4 >= 0
	r2a0_to_h5i5_exists: h5i5_exists - r2a0_to_h5i5 >= 0
	r2a0_to_h5i6_exists: h5i6_exists - r2a0_to_h5i6 >= 0
	r2a0_to_h5i7_exists: h5i7_exists - r2a0_to_h5i7 >= 0
	r2a0_to_h5i8_exists: h5i8_exists - r2a0_to_h5i8 >= 0
	r2a0_to_h5i9_exists: h5i9_exists - r2a0_to_h5i9 >= 0
	r3a0_allocated: r3a0_to_h0i0 + r3a0_to_h0i1 + r3a0_to_h0i2 + r3a0_to_h0i3 + r3a0_to_h0i4 + r3a0_to_h0i5 + r3a0_to_h0i6 + r3a0_to_h0i7 + r3a0_to_h0i8 + r3a0_to_h0i9 + r3a0_to_h1i0 + r3a0_to_h1i1 + r3a0_to_h1i2 + r3a0_to_h1i3 + r3a0_to_h1i4 + r3a0_to_h1i5 + r3a0_to_h1i6 + r3a0_to_h1i7 + r3a0_to_h1i8 + r3a0_to_h1i9 + r3a0_to_h2i0 + r3a0_to_h2i1 + r3a0_to_h2i2 + r3a0_to_h2i3 + r3a0_to_h2i4 + r3a0_to_h2i5 + r3a0_to_h2i6 + r3a0_to_h2i7 + r3a0_to_h2i8 + r3a0_to_h2i9 + r3a0_to_h3i0 + r3a0_to_h3i1 + r3a0_to_h3i2 + r3a0_to_h3i3 + r3a0_to_h3i4 + r3a0_to_h3i5 + r3a0_to_h3i6 + r3a0_to_h3i7 + r3a0_to_h3i8 + r3a0_to_h3i9 + r3a0_to_h4i0 + r3a0_to_h4i1 + r3a0_to_h4i2 + r3a0_to_h4i3 + r3a0_to_h4i4 + r3a0_to_h4i5 + r3a0_to_h4i6 + r3a0_to_h4i7 + r3a0_to_h4i8 + r3a0_to_h4i9 + r3a0_to_h5i0 + r3a0_to_h5i1 + r3a0_to_h5i2 + r3a0_to_h5i3 + r3a0_to_h5i4 + r3a0_to_h5i5 + r3a0_to_h5i6 + r3a0_to_h5i7 + r3a0_to_h5i8 + r3a0_to_h5i9 = 1
	r3a0_to_h0i0_exists: h0i0_exists - r3a0_to_h0i0 >= 0
	r3a0_to_h0i1_exists: h0i1_exists - r3a0_to_h0i1 >= 0
	r3a0_to_h0i2_exists: h0i2_exists - r3a0_to_h0i2 >= 0
	r3a0_to_h0i3_exists: h0i3_exists - r3a0_to_h0i3 >= 0
	r3a0_to_h0i4_exists: h0i4_exists - r3a0_to_h0i4 >= 0
	r3a0_to_h0i5_exists: h0i5_exists - r3a0_to_h0i5 >= 0
	r3a0_to_h0i6_exists: h0i6_exists - r3a0_to_h0i6 >= 0
	r3a0_to_h0i7_exists: h0i7_exists - r3a0_to_h0i7 >= 0
	r3a0_to_h0i8_exists: h0i8_exists - r3a0_to_h0i8 >= 0
	r3a0_to_h0i9_exists: h0i9_exists - r3a0_to_h0i9 >= 0
	r3a0_to_h1i0_exists: h1i0_exists - r3a0_to_h1i0 >= 0
	r3a0_to_h1i1_exists: h1i1_exists - r3a0_to_h1i1 >= 0
	r3a0_to_h1i2_exists: h1i2_exists - r3a0_to_h1i2 >= 0
	r3a0_to_h1i3_exists: h1i3_exists - r3a0_to_h1i3 >= 0
	r3a0_to_h1i4_exists: h1i4_exists - r3a0_to_h1i4 >= 0
	r3a0_to_h1i5_exists: h1i5_exists - r3a0_to_h1i5 >= 0
	r3a0_to_h1i6_exists: h1i6_exists - r3a0_to_h1i6 >= 0
	r3a0_to_h1i7_exists: h1i7_exists - r3a0_to_h1i7 >= 0
	r3a0_to_h1i8_exists: h1i8_exists - r3a0_to_h1i8 >= 0
	r3a0_to_h1i9_exists: h1i9_exists - r3a0_to_h1i9 >= 0
	r3a0_to_h2i0_exists: h2i0_exists - r3a0_to_h2i0 >= 0
	r3a0_to_h2i1_exists: h2i1_exists - r3a0_to_h2i1 >= 0
	r3a0_to_h2i2_exists: h2i2_exists - r3a0_to_h2i2 >= 0
	r3a0_to_h2i3_exists: h2i3_exists - r3a0_to_h2i3 >= 0
	r3a0_to_h2i4_exists: h2i4_exists - r3a0_to_h2i4 >= 0
	r3a0_to_h2i5_exists: h2i5_exists - r3a0_to_h2i5 >= 0
	r3a0_to_h2i6_exists: h2i6_exists - r3a0_to_h2i6 >= 0
	r3a0_to_h2i7_exists: h2i7_exists - r3a0_to_h2i7 >= 0
	r3a0_to_h2i8_exists: h2i8_exists - r3a0_to_h2i8 >= 0
	r3a0_to_h2i9_exists: h2i9_exists - r3a0_to_h2i9 >= 0
	r3a0_to_h3i0_exists: h3i0_exists - r3a0_to_h3i0 >= 0
	r3a0_to_h3i1_exists: h3i1_exists - r3a0_to_h3i1 >= 0
	r3a0_to_h3i2_exists: h3i2_exists - r3a0_to_h3i2 >= 0
	r3a0_to_h3i3_exists: h3i3_exists - r3a0_to_h3i3 >= 0
	r3a0_to_h3i4_exists: h3i4_exists - r3a0_to_h3i4 >= 0
	r3a0_to_h3i5_exists: h3i5_exists - r3a0_to_h3i5 >= 0
	r3a0_to_h3i6_exists: h3i6_exists - r3a0_to_h3i6 >= 0
	r3a0_to_h3i7_exists: h3i7_exists - r3a0_to_h3i7 >= 0
	r3a0_to_h3i8_exists: h3i8_exists - r3a0_to_h3i8 >= 0
	r3a0_to_h3i9_exists: h3i9_exists - r3a0_to_h3i9 >= 0
	r3a0_to_h4i0_exists: h4i0_exists - r3a0_to_h4i0 >= 0
	r3a0_to_h4i1_exists: h4i1_exists - r3a0_to_h4i1 >= 0
	r3a0_to_h4i2_exists: h4i2_exists - r3a0_to_h4i2 >= 0
	r3a0_to_h4i3_exists: h4i3_exists - r3a0_to_h4i3 >= 0
	r3a0_to_h4i4_exists: h4i4_exists - r3a0_to_h4i4 >= 0
	r3a0_to_h4i5_exists: h4i5_exists - r3a0_to_h4i5 >= 0
	r3a0_to_h4i6_exists: h4i6_exists - r3a0_to_h4i6 >= 0
	r3a0_to_h4i7_exists: h4i7_exists - r3a0_to_h4i7 >= 0
	r3a0_to_h4i8_exists: h4i8_exists - r3a0_to_h4i8 >= 0
	r3a0_to_h4i9_exists: h4i9_exists - r3a0_to_h4i9 >= 0
	r3a0_to_h5i0_exists: h5i0_exists - r3a0_to_h5i0 >= 0
	r3a0_to_h5i1_exists: h5i1_exists - r3a0_to_h5i1 >= 0
	r3a0_to_h5i2_exists: h5i2_exists - r3a0_to_h5i2 >= 0
	r3a0_to_h5i3_exists: h5i3_exists - r3a0_to_h5i3 >= 0
	r3a0_to_h5i4_exists: h5i4_exists - r3a0_to_h5i4 >= 0
	r3a0_to_h5i5_exists: h5i5_exists - r3a0_to_h5i5 >= 0
	r3a0_to_h5i6_exists: h5i6_exists - r3a0_to_h5i6 >= 0
	r3a0_to_h5i7_exists: h5i7_exists - r3a0_to_h5i7 >= 0
	r3a0_to_h5i8_exists: h5i8_exists - r3a0_to_h5i8 >= 0
	r3a0_to_h5i9_exists: h5i9_exists - r3a0_to_h5i9 >= 0
	r4a0_allocated: r4a0_to_h4i0 + r4a0_to_h4i1 + r4a0_to_h4i2 + r4a0_to_h4i3 + r4a0_to_h4i4 + r4a0_to_h4i5 + r4a0_to_h4i6 + r4a0_to_h4i7 + r4a0_to_h4i8 + r4a0_to_h4i9 + r4a0_to_h5i0 + r4a0_to_h5i1 + r4a0_to_h5i2 + r4a0_to_h5i3 + r4a0_to_h5i4 + r4a0_to_h5i5 + r4a0_to_h5i6 + r4a0_to_h5i7 + r4a0_to_h5i8 + r4a0_to_h5i9 = 1
	r4a0_to_h4i0_exists: h4i0_exists - r4a0_to_h4i0 >= 0
	r4a0_to_h4i1_exists: h4i1_exists - r4a0_to_h4i1 >= 0
	r4a0_to_h4i2_exists: h4i2_exists - r4a0_to_h4i2 >= 0
	r4a0_to_h4i3_exists: h4i3_exists - r4a0_to_h4i3 >= 0
	r4a0_to_h4i4_exists: h4i4_exists - r4a0_to_h4i4 >= 0
	r4a0_to_h4i5_exists: h4i5_exists - r4a0_to_h4i5 >= 0
	r4a0_to_h4i6_exists: h4i6_exists - r4a0_to_h4i6 >= 0
	r4a0_to_h4i7_exists: h4i7_exists - r4a0_to_h4i7 >= 0
	r4a0_to_h4i8_exists: h4i8_exists - r4a0_to_h4i8 >= 0
	r4a0_to_h4i9_exists: h4i9_exists - r4a0_to_h4i9 >= 0
	r4a0_to_h5i0_exists: h5i0_exists - r4a0_to_h5i0 >= 0
	r4a0_to_h5i1_exists: h5i1_exists - r4a0_to_h5i1 >= 0
	r4a0_to_h5i2_exists: h5i2_exists - r4a0_to_h5i2 >= 0
	r4a0_to_h5i3_exists: h5i3_exists - r4a0_to_h5i3 >= 0
	r4a0_to_h5i4_exists: h5i4_exists - r4a0_to_h5i4 >= 0
	r4a0_to_h5i5_exists: h5i5_exists - r4a0_to_h5i5 >= 0
	r4a0_to_h5i6_exists: h5i6_exists - r4a0_to_h5i6 >= 0
	r4a0_to_h5i7_exists: h5i7_exists - r4a0_to_h5i7 >= 0
	r4a0_to_h5i8_exists: h5i8_exists - r4a0_to_h5i8 >= 0
	r4a0_to_h5i9_exists: h5i9_exists - r4a0_to_h5i9 >= 0
	r4a1_allocated: r4a1_to_h4i0 + r4a1_to_h4i1 + r4a1_to_h4i2 + r4a1_to_h4i3 + r4a1_to_h4i4 + r4a1_to_h4i5 + r4a1_to_h4i6 + r4a1_to_h4i7 + r4a1_to_h4i8 + r4a1_to_h4i9 + r4a1_to_h5i0 + r4a1_to_h5i1 + r4a1_to_h5i2 + r4a1_to_h5i3 + r4a1_to_h5i4 + r4a1_to_h5i5 + r4a1_to_h5i6 + r4a1_to_h5i7 + r4a1_to_h5i8 + r4a1_to_h5i9 = 1
	r4a1_to_h4i0_exists: h4i0_exists - r4a1_to_h4i0 >= 0
	r4a1_to_h4i1_exists: h4i1_exists - r4a1_to_h4i1 >= 0
	r4a1_to_h4i2_exists: h4i2_exists - r4a1_to_h4i2 >= 0
	r4a1_to_h4i3_exists: h4i3_exists - r4a1_to_h4i3 >= 0
	r4a1_to_h4i4_exists: h4i4_exists - r4a1_to_h4i4 >= 0
	r4a1_to_h4i5_exists: h4i5_exists - r4a1_to_h4i5 >= 0
	r4a1_to_h4i6_exists: h4i6_exists - r4a1_to_h4i6 >= 0
	r4a1_to_h4i7_exists: h4i7_exists - r4a1_to_h4i7 >= 0
	r4a1_to_h4i8_exists: h4i8_exists - r4a1_to_h4i8 >= 0
	r4a1_to_h4i9_exists: h4i9_exists - r4a1_to_h4i9 >= 0
	r4a1_to_h5i0_exists: h5i0_exists - r4a1_to_h5i0 >= 0
	r4a1_to_h5i1_exists: h5i1_exists - r4a1_to_h5i1 >= 0
	r4a1_to_h5i2_exists: h5i2_exists - r4a1_to_h5i2 >= 0
	r4a1_to_h5i3_exists: h5i3_exists - r4a1_to_h5i3 >= 0
	r4a1_to_h5i4_exists: h5i4_exists - r4a1_to_h5i4 >= 0
	r4a1_to_h5i5_exists: h5i5_exists - r4a1_to_h5i5 >= 0
	r4a1_to_h5i6_exists: h5i6_exists - r4a1_to_h5i6 >= 0
	r4a1_to_h5i7_exists: h5i7_exists - r4a1_to_h5i7 >= 0
	r4a1_to_h5i8_exists: h5i8_exists - r4a1_to_h5i8 >= 0
	r4a1_to_h5i9_exists: h5i9_exists - r4a1_to_h5i9 >= 0
	r4a2_allocated: r4a2_to_h4i0 + r4a2_to_h4i1 + r4a2_to_h4i2 + r4a2_to_h4i3 + r4a2_to_h4i4 + r4a2_to_h4i5 + r4a2_to_h4i6 + r4a2_to_h4i7 + r4a2_to_h4i8 + r4a2_to_h4i9 + r4a2_to_h5i0 + r4a2_to_h5i1 + r4a2_to_h5i2 + r4a2_to_h5i3 + r4a2_to_h5i4 + r4a2_to_h5i5 + r4a2_to_h5i6 + r4a2_to_h5i7 + r4a2_to_h5i8 + r4a2_to_h5i9 = 1
	r4a2_to_h4i0_exists: h4i0_exists - r4a2_to_h4i0 >= 0
	r4a2_to_h4i1_exists: h4i1_exists - r4a2_to_h4i1 >= 0
	r4a2_to_h4i2_exists: h4i2_exists - r4a2_to_h4i2 >= 0
	r4a2_to_h4i3_exists: h4i3_exists - r4a2_to_h4i3 >= 0
	r4a2_to_h4i4_exists: h4i4_exists - r4a2_to_h4i4 >= 0
	r4a2_to_h4i5_exists: h4i5_exists - r4a2_to_h4i5 >= 0
	r4a2_to_h4i6_exists: h4i6_exists - r4a2_to_h4i6 >= 0
	r4a2_to_h4i7_exists: h4i7_exists - r4a2_to_h4i7 >= 0
	r4a2_to_h4i8_exists: h4i8_exists - r4a2_to_h4i8 >= 0
	r4a2_to_h4i9_exists: h4i9_exists - r4a2_to_h4i9 >= 0
	r4a2_to_h5i0_exists: h5i0_exists - r4a2_to_h5i0 >= 0
	r4a2_to_h5i1_exists: h5i1_exists - r4a2_to_h5i1 >= 0
	r4a2_to_h5i2_exists: h5i2_exists - r4a2_to_h5i2 >= 0
	r4a2_to_h5i3_exists: h5i3_exists - r4a2_to_h5i3 >= 0
	r4a2_to_h5i4_exists: h5i4_exists - r4a2_to_h5i4 >= 0
	r4a2_to_h5i5_exists: h5i5_exists - r4a2_to_h5i5 >= 0
	r4a2_to_h5i6_exists: h5i6_exists - r4a2_to_h5i6 >= 0
	r4a2_to_h5i7_exists: h5i7_exists - r4a2_to_h5i7 >= 0
	r4a2_to_h5i8_exists: h5i8_exists - r4a2_to_h5i8 >= 0
	r4a2_to_h5i9_exists: h5i9_exists - r4a2_to_h5i9 >= 0
	r4a3_allocated: r4a3_to_h4i0 + r4a3_to_h4i1 + r4a3_to_h4i2 + r4a3_to_h4i3 + r4a3_to_h4i4 + r4a3_to_h4i5 + r4a3_to_h4i6 + r4a3_to_h4i7 + r4a3_to_h4i8 + r4a3_to_h4i9 + r4a3_to_h5i0 + r4a3_to_h5i1 + r4a3_to_h5i2 + r4a3_to_h5i3 + r4a3_to_h5i4 + r4a3_to_h5i5 + r4a3_to_h5i6 + r4a3_to_h5i7 + r4a3_to_h5i8 + r4a3_to_h5i9 = 1
	r4a3_to_h4i0_exists: h4i0_exists - r4a3_to_h4i0 >= 0
	r4a3_to_h4i1_exists: h4i1_exists - r4a3_to_h4i1 >= 0
	r4a3_to_h4i2_exists: h4i2_exists - r4a3_to_h4i2 >= 0
	r4a3_to_h4i3_exists: h4i3_exists - r4a3_to_h4i3 >= 0
	r4a3_to_h4i4_exists: h4i4_exists - r4a3_to_h4i4 >= 0
	r4a3_to_h4i5_exists: h4i5_exists - r4a3_to_h4i5 >= 0
	r4a3_to_h4i6_exists: h4i6_exists - r4a3_to_h4i6 >= 0
	r4a3_to_h4i7_exists: h4i7_exists - r4a3_to_h4i7 >= 0
	r4a3_to_h4i8_exists: h4i8_exists - r4a3_to_h4i8 >= 0
	r4a3_to_h4i9_exists: h4i9_exists - r4a3_to_h4i9 >= 0
	r4a3_to_h5i0_exists: h5i0_exists - r4a3_to_h5i0 >= 0
	r4a3_to_h5i1_exists: h5i1_exists - r4a3_to_h5i1 >= 0
	r4a3_to_h5i2_exists: h5i2_exists - r4a3_to_h5i2 >= 0
	r4a3_to_h5i3_exists: h5i3_exists - r4a3_to_h5i3 >= 0
	r4a3_to_h5i4_exists: h5i4_exists - r4a3_to_h5i4 >= 0
	r4a3_to_h5i5_exists: h5i5_exists - r4a3_to_h5i5 >= 0
	r4a3_to_h5i6_exists: h5i6_exists - r4a3_to_h5i6 >= 0
	r4a3_to_h5i7_exists: h5i7_exists - r4a3_to_h5i7 >= 0
	r4a3_to_h5i8_exists: h5i8_exists - r4a3_to_h5i8 >= 0
	r4a3_to_h5i9_exists: h5i9_exists - r4a3_to_h5i9 >= 0
	r5a0_allocated: r5a0_to_h0i0 + r5a0_to_h0i1 + r5a0_to_h0i2 + r5a0_to_h0i3 + r5a0_to_h0i4 + r5a0_to_h0i5 + r5a0_to_h0i6 + r5a0_to_h0i7 + r5a0_to_h0i8 + r5a0_to_h0i9 + r5a0_to_h1i0 + r5a0_to_h1i1 + r5a0_to_h1i2 + r5a0_to_h1i3 + r5a0_to_h1i4 + r5a0_to_h1i5 + r5a0_to_h1i6 + r5a0_to_h1i7 + r5a0_to_h1i8 + r5a0_to_h1i9 + r5a0_to_h2i0 + r5a0_to_h2i1 + r5a0_to_h2i2 + r5a0_to_h2i3 + r5a0_to_h2i4 + r5a0_to_h2i5 + r5a0_to_h2i6 + r5a0_to_h2i7 + r5a0_to_h2i8 + r5a0_to_h2i9 + r5a0_to_h3i0 + r5a0_to_h3i1 + r5a0_to_h3i2 + r5a0_to_h3i3 + r5a0_to_h3i4 + r5a0_to_h3i5 + r5a0_to_h3i6 + r5a0_to_h3i7 + r5a0_to_h3i8 + r5a0_to_h3i9 + r5a0_to_h4i0 + r5a0_to_h4i1 + r5a0_to_h4i2 + r5a0_to_h4i3 + r5a0_to_h4i4 + r5a0_to_h4i5 + r5a0_to_h4i6 + r5a0_to_h4i7 + r5a0_to_h4i8 + r5a0_to_h4i9 + r5a0_to_h5i0 + r5a0_to_h5i1 + r5a0_to_h5i2 + r5a0_to_h5i3 + r5a0_to_h5i4 + r5a0_to_h5i5 + r5a0_to_h5i6 + r5a0_to_h5i7 + r5a0_to_h5i8 + r5a0_to_h5i9 = 1
	r5a0_to_h0i0_exists: h0i0_exists - r5a0_to_h0i0 >= 0
	r5a0_to_h0i1_exists: h0i1_exists - r5a0_to_h0i1 >= 0
	r5a0_to_h0i2_exists: h0i2_exists - r5a0_to_h0i2 >= 0
	r5a0_to_h0i3_exists: h0i3_exists - r5a0_to_h0i3 >= 0
	r5a0_to_h0i4_exists: h0i4_exists - r5a0_to_h0i4 >= 0
	r5a0_to_h0i5_exists: h0i5_exists - r5a0_to_h0i5 >= 0
	r5a0_to_h0i6_exists: h0i6_exists - r5a0_to_h0i6 >= 0
	r5a0_to_h0i7_exists: h0i7_exists - r5a0_to_h0i7 >= 0
	r5a0_to_h0i8_exists: h0i8_exists - r5a0_to_h0i8 >= 0
	r5a0_to_h0i9_exists: h0i9_exists - r5a0_to_h0i9 >= 0
	r5a0_to_h1i0_exists: h1i0_exists - r5a0_to_h1i0 >= 0
	r5a0_to_h1i1_exists: h1i1_exists - r5a0_to_h1i1 >= 0
	r5a0_to_h1i2_exists: h1i2_exists - r5a0_to_h1i2 >= 0
	r5a0_to_h1i3_exists: h1i3_exists - r5a0_to_h1i3 >= 0
	r5a0_to_h1i4_exists: h1i4_exists - r5a0_to_h1i4 >= 0
	r5a0_to_h1i5_exists: h1i5_exists - r5a0_to_h1i5 >= 0
	r5a0_to_h1i6_exists: h1i6_exists - r5a0_to_h1i6 >= 0
	r5a0_to_h1i7_exists: h1i7_exists - r5a0_to_h1i7 >= 0
	r5a0_to_h1i8_exists: h1i8_exists - r5a0_to_h1i8 >= 0
	r5a0_to_h1i9_exists: h1i9_exists - r5a0_to_h1i9 >= 0
	r5a0_to_h2i0_exists: h2i0_exists - r5a0_to_h2i0 >= 0
	r5a0_to_h2i1_exists: h2i1_exists - r5a0_to_h2i1 >= 0
	r5a0_to_h2i2_exists: h2i2_exists - r5a0_to_h2i2 >= 0
	r5a0_to_h2i3_exists: h2i3_exists - r5a0_to_h2i3 >= 0
	r5a0_to_h2i4_exists: h2i4_exists - r5a0_to_h2i4 >= 0
	r5a0_to_h2i5_exists: h2i5_exists - r5a0_to_h2i5 >= 0
	r5a0_to_h2i6_exists: h2i6_exists - r5a0_to_h2i6 >= 0
	r5a0_to_h2i7_exists: h2i7_exists - r5a0_to_h2i7 >= 0
	r5a0_to_h2i8_exists: h2i8_exists - r5a0_to_h2i8 >= 0
	r5a0_to_h2i9_exists: h2i9_exists - r5a0_to_h2i9 >= 0
	r5a0_to_h3i0_exists: h3i0_exists - r5a0_to_h3i0 >= 0
	r5a0_to_h3i1_exists: h3i1_exists - r5a0_to_h3i1 >= 0
	r5a0_to_h3i2_exists: h3i2_exists - r5a0_to_h3i2 >= 0
	r5a0_to_h3i3_exists: h3i3_exists - r5a0_to_h3i3 >= 0
	r5a0_to_h3i4_exists: h3i4_exists - r5a0_to_h3i4 >= 0
	r5a0_to_h3i5_exists: h3i5_exists - r5a0_to_h3i5 >= 0
	r5a0_to_h3i6_exists: h3i6_exists - r5a0_to_h3i6 >= 0
	r5a0_to_h3i7_exists: h3i7_exists - r5a0_to_h3i7 >= 0
	r5a0_to_h3i8_exists: h3i8_exists - r5a0_to_h3i8 >= 0
	r5a0_to_h3i9_exists: h3i9_exists - r5a0_to_h3i9 >= 0
	r5a0_to_h4i0_exists: h4i0_exists - r5a0_to_h4i0 >= 0
	r5a0_to_h4i1_exists: h4i1_exists - r5a0_to_h4i1 >= 0
	r5a0_to_h4i2_exists: h4i2_exists - r5a0_to_h4i2 >= 0
	r5a0_to_h4i3_exists: h4i3_exists - r5a0_to_h4i3 >= 0
	r5a0_to_h4i4_exists: h4i4_exists - r5a0_to_h4i4 >= 0
	r5a0_to_h4i5_exists: h4i5_exists - r5a0_to_h4i5 >= 0
	r5a0_to_h4i6_exists: h4i6_exists - r5a0_to_h4i6 >= 0
	r5a0_to_h4i7_exists: h4i7_exists - r5a0_to_h4i7 >= 0
	r5a0_to_h4i8_exists: h4i8_exists - r5a0_to_h4i8 >= 0
	r5a0_to_h4i9_exists: h4i9_exists - r5a0_to_h4i9 >= 0
	r5a0_to_h5i0_exists: h5i0_exists - r5a0_to_h5i0 >= 0
	r5a0_to_h5i1_exists: h5i1_exists - r5a0_to_h5i1 >= 0
	r5a0_to_h5i2_exists: h5i2_exists - r5a0_to_h5i2 >= 0
	r5a0_to_h5i3_exists: h5i3_exists - r5a0_to_h5i3 >= 0
	r5a0_to_h5i4_exists: h5i4_exists - r5a0_to_h5i4 >= 0
	r5a0_to_h5i5_exists: h5i5_exists - r5a0_to_h5i5 >= 0
	r5a0_to_h5i6_exists: h5i6_exists - r5a0_to_h5i6 >= 0
	r5a0_to_h5i7_exists: h5i7_exists - r5a0_to_h5i7 >= 0
	r5a0_to_h5i8_exists: h5i8_exists - r5a0_to_h5i8 >= 0
	r5a0_to_h5i9_exists: h5i9_exists - r5a0_to_h5i9 >= 0
	r6a0_allocated: r6a0_to_h0i0 + r6a0_to_h0i1 + r6a0_to_h0i2 + r6a0_to_h0i3 + r6a0_to_h0i4 + r6a0_to_h0i5 + r6a0_to_h0i6 + r6a0_to_h0i7 + r6a0_to_h0i8 + r6a0_to_h0i9 + r6a0_to_h1i0 + r6a0_to_h1i1 + r6a0_to_h1i2 + r6a0_to_h1i3 + r6a0_to_h1i4 + r6a0_to_h1i5 + r6a0_to_h1i6 + r6a0_to_h1i7 + r6a0_to_h1i8 + r6a0_to_h1i9 + r6a0_to_h2i0 + r6a0_to_h2i1 + r6a0_to_h2i2 + r6a0_to_h2i3 + r6a0_to_h2i4 + r6a0_to_h2i5 + r6a0_to_h2i6 + r6a0_to_h2i7 + r6a0_to_h2i8 + r6a0_to_h2i9 + r6a0_to_h3i0 + r6a0_to_h3i1 + r6a0_to_h3i2 + r6a0_to_h3i3 + r6a0_to_h3i4 + r6a0_to_h3i5 + r6a0_to_h3i6 + r6a0_to_h3i7 + r6a0_to_h3i8 + r6a0_to_h3i9 + r6a0_to_h4i0 + r6a0_to_h4i1 + r6a0_to_h4i2 + r6a0_to_h4i3 + r6a0_to_h4i4 + r6a0_to_h4i5 + r6a0_to_h4i6 + r6a0_to_h4i7 + r6a0_to_h4i8 + r6a0_to_h4i9 + r6a0_to_h5i0 + r6a0_to_h5i1 + r6a0_to_h5i2 + r6a0_to_h5i3 + r6a0_to_h5i4 + r6a0_to_h5i5 + r6a0_to_h5i6 + r6a0_to_h5i7 + r6a0_to_h5i8 + r6a0_to_h5i9 = 1
	r6a0_to_h0i0_exists: h0i0_exists - r6a0_to_h0i0 >= 0
	r6a0_to_h0i1_exists: h0i1_exists - r6a0_to_h0i1 >= 0
	r6a0_to_h0i2_exists: h0i2_exists - r6a0_to_h0i2 >= 0
	r6a0_to_h0i3_exists: h0i3_exists - r6a0_to_h0i3 >= 0
	r6a0_to_h0i4_exists: h0i4_exists - r6a0_to_h0i4 >= 0
	r6a0_to_h0i5_exists: h0i5_exists - r6a0_to_h0i5 >= 0
	r6a0_to_h0i6_exists: h0i6_exists - r6a0_to_h0i6 >= 0
	r6a0_to_h0i7_exists: h0i7_exists - r6a0_to_h0i7 >= 0
	r6a0_to_h0i8_exists: h0i8_exists - r6a0_to_h0i8 >= 0
	r6a0_to_h0i9_exists: h0i9_exists - r6a0_to_h0i9 >= 0
	r6a0_to_h1i0_exists: h1i0_exists - r6a0_to_h1i0 >= 0
	r6a0_to_h1i1_exists: h1i1_exists - r6a0_to_h1i1 >= 0
	r6a0_to_h1i2_exists: h1i2_exists - r6a0_to_h1i2 >= 0
	r6a0_to_h1i3_exists: h1i3_exists - r6a0_to_h1i3 >= 0
	r6a0_to_h1i4_exists: h1i4_exists - r6a0_to_h1i4 >= 0
	r6a0_to_h1i5_exists: h1i5_exists - r6a0_to_h1i5 >= 0
	r6a0_to_h1i6_exists: h1i6_exists - r6a0_to_h1i6 >= 0
	r6a0_to_h1i7_exists: h1i7_exists - r6a0_to_h1i7 >= 0
	r6a0_to_h1i8_exists: h1i8_exists - r6a0_to_h1i8 >= 0
	r6a0_to_h1i9_exists: h1i9_exists - r6a0_to_h1i9 >= 0
	r6a0_to_h2i0_exists: h2i0_exists - r6a0_to_h2i0 >= 0
	r6a0_to_h2i1_exists: h2i1_exists - r6a0_to_h2i1 >= 0
	r6a0_to_h2i2_exists: h2i2_exists - r6a0_to_h2i2 >= 0
	r6a0_to_h2i3_exists: h2i3_exists - r6a0_to_h2i3 >= 0
	r6a0_to_h2i4_exists: h2i4_exists - r6a0_to_h2i4 >= 0
	r6a0_to_h2i5_exists: h2i5_exists - r6a0_to_h2i5 >= 0
	r6a0_to_h2i6_exists: h2i6_exists - r6a0_to_h2i6 >= 0
	r6a0_to_h2i7_exists: h2i7_exists - r6a0_to_h2i7 >= 0
	r6a0_to_h2i8_exists: h2i8_exists - r6a0_to_h2i8 >= 0
	r6a0_to_h2i9_exists: h2i9_exists - r6a0_to_h2i9 >= 0
	r6a0_to_h3i0_exists: h3i0_exists - r6a0_to_h3i0 >= 0
	r6a0_to_h3i1_exists: h3i1_exists - r6a0_to_h3i1 >= 0
	r6a0_to_h3i2_exists: h3i2_exists - r6a0_to_h3i2 >= 0
	r6a0_to_h3i3_exists: h3i3_exists - r6a0_to_h3i3 >= 0
	r6a0_to_h3i4_exists: h3i4_exists - r6a0_to_h3i4 >= 0
	r6a0_to_h3i5_exists: h3i5_exists - r6a0_to_h3i5 >= 0
	r6a0_to_h3i6_exists: h3i6_exists - r6a0_to_h3i6 >= 0
	r6a0_to_h3i7_exists: h3i7_exists - r6a0_to_h3i7 >= 0
	r6a0_to_h3i8_exists: h3i8_exists - r6a0_to_h3i8 >= 0
	r6a0_to_h3i9_exists: h3i9_exists - r6a0_to_h3i9 >= 0
	r6a0_to_h4i0_exists: h4i0_exists - r6a0_to_h4i0 >= 0
	r6a0_to_h4i1_exists: h4i1_exists - r6a0_to_h4i1 >= 0
	r6a0_to_h4i2_exists: h4i2_exists - r6a0_to_h4i2 >= 0
	r6a0_to_h4i3_exists: h4i3_exists - r6a0_to_h4i3 >= 0
	r6a0_to_h4i4_exists: h4i4_exists - r6a0_to_h4i4 >= 0
	r6a0_to_h4i5_exists: h4i5_exists - r6a0_to_h4i5 >= 0
	r6a0_to_h4i6_exists: h4i6_exists - r6a0_to_h4i6 >= 0
	r6a0_to_h4i7_exists: h4i7_exists - r6a0_to_h4i7 >= 0
	r6a0_to_h4i8_exists: h4i8_exists - r6a0_to_h4i8 >= 0
	r6a0_to_h4i9_exists: h4i9_exists - r6a0_to_h4i9 >= 0
	r6a0_to_h5i0_exists: h5i0_exists - r6a0_to_h5i0 >= 0
	r6a0_to_h5i1_exists: h5i1_exists - r6a0_to_h5i1 >= 0
	r6a0_to_h5i2_exists: h5i2_exists - r6a0_to_h5i2 >= 0
	r6a0_to_h5i3_exists: h5i3_exists - r6a0_to_h5i3 >= 0
	r6a0_to_h5i4_exists: h5i4_exists - r6a0_to_h5i4 >= 0
	r6a0_to_h5i5_exists: h5i5_exists - r6a0_to_h5i5 >= 0
	r6a0_to_h5i6_exists: h5i6_exists - r6a0_to_h5i6 >= 0
	r6a0_to_h5i7_exists: h5i7_exists - r6a0_to_h5i7 >= 0
	r6a0_to_h5i8_exists: h5i8_exists - r6a0_to_h5i8 >= 0
	r6a0_to_h5i9_exists: h5i9_exists - r6a0_to_h5i9 >= 0
	r6a1_allocated: r6a1_to_h0i0 + r6a1_to_h0i1 + r6a1_to_h0i2 + r6a1_to_h0i3 + r6a1_to_h0i4 + r6a1_to_h0i5 + r6a1_to_h0i6 + r6a1_to_h0i7 + r6a1_to_h0i8 + r6a1_to_h0i9 + r6a1_to_h1i0 + r6a1_to_h1i1 + r6a1_to_h1i2 + r6a1_to_h1i3 + r6a1_to_h1i4 + r6a1_to_h1i5 + r6a1_to_h1i6 + r6a1_to_h1i7 + r6a1_to_h1i8 + r6a1_to_h1i9 + r6a1_to_h2i0 + r6a1_to_h2i1 + r6a1_to_h2i2 + r6a1_to_h2i3 + r6a1_to_h2i4 + r6a1_to_h2i5 + r6a1_to_h2i6 + r6a1_to_h2i7 + r6a1_to_h2i8 + r6a1_to_h2i9 + r6a1_to_h3i0 + r6a1_to_h3i1 + r6a1_to_h3i2 + r6a1_to_h3i3 + r6a1_to_h3i4 + r6a1_to_h3i5 + r6a1_to_h3i6 + r6a1_to_h3i7 + r6a1_to_h3i8 + r6a1_to_h3i9 + r6a1_to_h4i0 + r6a1_to_h4i1 + r6a1_to_h4i2 + r6a1_to_h4i3 + r6a1_to_h4i4 + r6a1_to_h4i5 + r6a1_to_h4i6 + r6a1_to_h4i7 + r6a1_to_h4i8 + r6a1_to_h4i9 + r6a1_to_h5i0 + r6a1_to_h5i1 + r6a1_to_h5i2 + r6a1_to_h5i3 + r6a1_to_h5i4 + r6a1_to_h5i5 + r6a1_to_h5i6 + r6a1_to_h5i7 + r6a1_to_h5i8 + r6a1_to_h5i9 = 1
	r6a1_to_h0i0_exists: h0i0_exists - r6a1_to_h0i0 >= 0
	r6a1_to_h0i1_exists: h0i1_exists - r6a1_to_h0i1 >= 0
	r6a1_to_h0i2_exists: h0i2_exists - r6a1_to_h0i2 >= 0
	r6a1_to_h0i3_exists: h0i3_exists - r6a1_to_h0i3 >= 0
	r6a1_to_h0i4_exists: h0i4_exists - r6a1_to_h0i4 >= 0
	r6a1_to_h0i5_exists: h0i5_exists - r6a1_to_h0i5 >= 0
	r6a1_to_h0i6_exists: h0i6_exists - r6a1_to_h0i6 >= 0
	r6a1_to_h0i7_exists: h0i7_exists - r6a1_to_h0i7 >= 0
	r6a1_to_h0i8_exists: h0i8_exists - r6a1_to_h0i8 >= 0
	r6a1_to_h0i9_exists: h0i9_exists - r6a1_to_h0i9 >= 0
	r6a1_to_h1i0_exists: h1i0_exists - r6a1_to_h1i0 >= 0
	r6a1_to_h1i1_exists: h1i1_exists - r6a1_to_h1i1 >= 0
	r6a1_to_h1i2_exists: h1i2_exists - r6a1_to_h1i2 >= 0
	r6a1_to_h1i3_exists: h1i3_exists - r6a1_to_h1i3 >= 0
	r6a1_to_h1i4_exists: h1i4_exists - r6a1_to_h1i4 >= 0
	r6a1_to_h1i5_exists: h1i5_exists - r6a1_to_h1i5 >= 0
	r6a1_to_h1i6_exists: h1i6_exists - r6a1_to_h1i6 >= 0
	r6a1_to_h1i7_exists: h1i7_exists - r6a1_to_h1i7 >= 0
	r6a1_to_h1i8_exists: h1i8_exists - r6a1_to_h1i8 >= 0
	r6a1_to_h1i9_exists: h1i9_exists - r6a1_to_h1i9 >= 0
	r6a1_to_h2i0_exists: h2i0_exists - r6a1_to_h2i0 >= 0
	r6a1_to_h2i1_exists: h2i1_exists - r6a1_to_h2i1 >= 0
	r6a1_to_h2i2_exists: h2i2_exists - r6a1_to_h2i2 >= 0
	r6a1_to_h2i3_exists: h2i3_exists - r6a1_to_h2i3 >= 0
	r6a1_to_h2i4_exists: h2i4_exists - r6a1_to_h2i4 >= 0
	r6a1_to_h2i5_exists: h2i5_exists - r6a1_to_h2i5 >= 0
	r6a1_to_h2i6_exists: h2i6_exists - r6a1_to_h2i6 >= 0
	r6a1_to_h2i7_exists: h2i7_exists - r6a1_to_h2i7 >= 0
	r6a1_to_h2i8_exists: h2i8_exists - r6a1_to_h2i8 >= 0
	r6a1_to_h2i9_exists: h2i9_exists - r6a1_to_h2i9 >= 0
	r6a1_to_h3i0_exists: h3i0_exists - r6a1_to_h3i0 >= 0
	r6a1_to_h3i1_exists: h3i1_exists - r6a1_to_h3i1 >= 0
	r6a1_to_h3i2_exists: h3i2_exists - r6a1_to_h3i2 >= 0
	r6a1_to_h3i3_exists: h3i3_exists - r6a1_to_h3i3 >= 0
	r6a1_to_h3i4_exists: h3i4_exists - r6a1_to_h3i4 >= 0
	r6a1_to_h3i5_exists: h3i5_exists - r6a1_to_h3i5 >= 0
	r6a1_to_h3i6_exists: h3i6_exists - r6a1_to_h3i6 >= 0
	r6a1_to_h3i7_exists: h3i7_exists - r6a1_to_h3i7 >= 0
	r6a1_to_h3i8_exists: h3i8_exists - r6a1_to_h3i8 >= 0
	r6a1_to_h3i9_exists: h3i9_exists - r6a1_to_h3i9 >= 0
	r6a1_to_h4i0_exists: h4i0_exists - r6a1_to_h4i0 >= 0
	r6a1_to_h4i1_exists: h4i1_exists - r6a1_to_h4i1 >= 0
	r6a1_to_h4i2_exists: h4i2_exists - r6a1_to_h4i2 >= 0
	r6a1_to_h4i3_exists: h4i3_exists - r6a1_to_h4i3 >= 0
	r6a1_to_h4i4_exists: h4i4_exists - r6a1_to_h4i4 >= 0
	r6a1_to_h4i5_exists: h4i5_exists - r6a1_to_h4i5 >= 0
	r6a1_to_h4i6_exists: h4i6_exists - r6a1_to_h4i6 >= 0
	r6a1_to_h4i7_exists: h4i7_exists - r6a1_to_h4i7 >= 0
	r6a1_to_h4i8_exists: h4i8_exists - r6a1_to_h4i8 >= 0
	r6a1_to_h4i9_exists: h4i9_exists - r6a1_to_h4i9 >= 0
	r6a1_to_h5i0_exists: h5i0_exists - r6a1_to_h5i0 >= 0
	r6a1_to_h5i1_exists: h5i1_exists - r6a1_to_h5i1 >= 0
	r6a1_to_h5i2_exists: h5i2_exists - r6a1_to_h5i2 >= 0
	r6a1_to_h5i3_exists: h5i3_exists - r6a1_to_h5i3 >= 0
	r6a1_to_h5i4_exists: h5i4_exists - r6a1_to_h5i4 >= 0
	r6a1_to_h5i5_exists: h5i5_exists - r6a1_to_h5i5 >= 0
	r6a1_to_h5i6_exists: h5i6_exists - r6a1_to_h5i6 >= 0
	r6a1_to_h5i7_exists: h5i7_exists - r6a1_to_h5i7 >= 0
	r6a1_to_h5i8_exists: h5i8_exists - r6a1_to_h5i8 >= 0
	r6a1_to_h5i9_exists: h5i9_exists - r6a1_to_h5i9 >= 0
	r6a2_allocated: r6a2_to_h0i0 + r6a2_to_h0i1 + r6a2_to_h0i2 + r6a2_to_h0i3 + r6a2_to_h0i4 + r6a2_to_h0i5 + r6a2_to_h0i6 + r6a2_to_h0i7 + r6a2_to_h0i8 + r6a2_to_h0i9 + r6a2_to_h1i0 + r6a2_to_h1i1 + r6a2_to_h1i2 + r6a2_to_h1i3 + r6a2_to_h1i4 + r6a2_to_h1i5 + r6a2_to_h1i6 + r6a2_to_h1i7 + r6a2_to_h1i8 + r6a2_to_h1i9 + r6a2_to_h2i0 + r6a2_to_h2i1 + r6a2_to_h2i2 + r6a2_to_h2i3 + r6a2_to_h2i4 + r6a2_to_h2i5 + r6a2_to_h2i6 + r6a2_to_h2i7 + r6a2_to_h2i8 + r6a2_to_h2i9 + r6a2_to_h3i0 + r6a2_to_h3i1 + r6a2_to_h3i2 + r6a2_to_h3i3 + r6a2_to_h3i4 + r6a2_to_h3i5 + r6a2_to_h3i6 + r6a2_to_h3i7 + r6a2_to_h3i8 + r6a2_to_h3i9 + r6a2_to_h4i0 + r6a2_to_h4i1 + r6a2_to_h4i2 + r6a2_to_h4i3 + r6a2_to_h4i4 + r6a2_to_h4i5 + r6a2_to_h4i6 + r6a2_to_h4i7 + r6a2_to_h4i8 + r6a2_to_h4i9 + r6a2_to_h5i0 + r6a2_to_h5i1 + r6a2_to_h5i2 + r6a2_to_h5i3 + r6a2_to_h5i4 + r6a2_to_h5i5 + r6a2_to_h5i6 + r6a2_to_h5i7 + r6a2_to_h5i8 + r6a2_to_h5i9 = 1
	r6a2_to_h0i0_exists: h0i0_exists - r6a2_to_h0i0 >= 0
	r6a2_to_h0i1_exists: h0i1_exists - r6a2_to_h0i1 >= 0
	r6a2_to_h0i2_exists: h0i2_exists - r6a2_to_h0i2 >= 0
	r6a2_to_h0i3_exists: h0i3_exists - r6a2_to_h0i3 >= 0
	r6a2_to_h0i4_exists: h0i4_exists - r6a2_to_h0i4 >= 0
	r6a2_to_h0i5_exists: h0i5_exists - r6a2_to_h0i5 >= 0
	r6a2_to_h0i6_exists: h0i6_exists - r6a2_to_h0i6 >= 0
	r6a2_to_h0i7_exists: h0i7_exists - r6a2_to_h0i7 >= 0
	r6a2_to_h0i8_exists: h0i8_exists - r6a2_to_h0i8 >= 0
	r6a2_to_h0i9_exists: h0i9_exists - r6a2_to_h0i9 >= 0
	r6a2_to_h1i0_exists: h1i0_exists - r6a2_to_h1i0 >= 0
	r6a2_to_h1i1_exists: h1i1_exists - r6a2_to_h1i1 >= 0
	r6a2_to_h1i2_exists: h1i2_exists - r6a2_to_h1i2 >= 0
	r6a2_to_h1i3_exists: h1i3_exists - r6a2_to_h1i3 >= 0
	r6a2_to_h1i4_exists: h1i4_exists - r6a2_to_h1i4 >= 0
	r6a2_to_h1i5_exists: h1i5_exists - r6a2_to_h1i5 >= 0
	r6a2_to_h1i6_exists: h1i6_exists - r6a2_to_h1i6 >= 0
	r6a2_to_h1i7_exists: h1i7_exists - r6a2_to_h1i7 >= 0
	r6a2_to_h1i8_exists: h1i8_exists - r6a2_to_h1i8 >= 0
	r6a2_to_h1i9_exists: h1i9_exists - r6a2_to_h1i9 >= 0
	r6a2_to_h2i0_exists: h2i0_exists - r6a2_to_h2i0 >= 0
	r6a2_to_h2i1_exists: h2i1_exists - r6a2_to_h2i1 >= 0
	r6a2_to_h2i2_exists: h2i2_exists - r6a2_to_h2i2 >= 0
	r6a2_to_h2i3_exists: h2i3_exists - r6a2_to_h2i3 >= 0
	r6a2_to_h2i4_exists: h2i4_exists - r6a2_to_h2i4 >= 0
	r6a2_to_h2i5_exists: h2i5_exists - r6a2_to_h2i5 >= 0
	r6a2_to_h2i6_exists: h2i6_exists - r6a2_to_h2i6 >= 0
	r6a2_to_h2i7_exists: h2i7_exists - r6a2_to_h2i7 >= 0
	r6a2_to_h2i8_exists: h2i8_exists - r6a2_to_h2i8 >= 0
	r6a2_to_h2i9_exists: h2i9_exists - r6a2_to_h2i9 >= 0
	r6a2_to_h3i0_exists: h3i0_exists - r6a2_to_h3i0 >= 0
	r6a2_to_h3i1_exists: h3i1_exists - r6a2_to_h3i1 >= 0
	r6a2_to_h3i2_exists: h3i2_exists - r6a2_to_h3i2 >= 0
	r6a2_to_h3i3_exists: h3i3_exists - r6a2_to_h3i3 >= 0
	r6a2_to_h3i4_exists: h3i4_exists - r6a2_to_h3i4 >= 0
	r6a2_to_h3i5_exists: h3i5_exists - r6a2_to_h3i5 >= 0
	r6a2_to_h3i6_exists: h3i6_exists - r6a2_to_h3i6 >= 0
	r6a2_to_h3i7_exists: h3i7_exists - r6a2_to_h3i7 >= 0
	r6a2_to_h3i8_exists: h3i8_exists - r6a2_to_h3i8 >= 0
	r6a2_to_h3i9_exists: h3i9_exists - r6a2_to_h3i9 >= 0
	r6a2_to_h4i0_exists: h4i0_exists - r6a2_to_h4i0 >= 0
	r6a2_to_h4i1_exists: h4i1_exists - r6a2_to_h4i1 >= 0
	r6a2_to_h4i2_exists: h4i2_exists - r6a2_to_h4i2 >= 0
	r6a2_to_h4i3_exists: h4i3_exists - r6a2_to_h4i3 >= 0
	r6a2_to_h4i4_exists: h4i4_exists - r6a2_to_h4i4 >= 0
	r6a2_to_h4i5_exists: h4i5_exists - r6a2_to_h4i5 >= 0
	r6a2_to_h4i6_exists: h4i6_exists - r6a2_to_h4i6 >= 0
	r6a2_to_h4i7_exists: h4i7_exists - r6a2_to_h4i7 >= 0
	r6a2_to_h4i8_exists: h4i8_exists - r6a2_to_h4i8 >= 0
	r6a2_to_h4i9_exists: h4i9_exists - r6a2_to_h4i9 >= 0
	r6a2_to_h5i0_exists: h5i0_exists - r6a2_to_h5i0 >= 0
	r6a2_to_h5i1_exists: h5i1_exists - r6a2_to_h5i1 >= 0
	r6a2_to_h5i2_exists: h5i2_exists - r6a2_to_h5i2 >= 0
	r6a2_to_h5i3_exists: h5i3_exists - r6a2_to_h5i3 >= 0
	r6a2_to_h5i4_exists: h5i4_exists - r6a2_to_h5i4 >= 0
	r6a2_to_h5i5_exists: h5i5_exists - r6a2_to_h5i5 >= 0
	r6a2_to_h5i6_exists: h5i6_exists - r6a2_to_h5i6 >= 0
	r6a2_to_h5i7_exists: h5i7_exists - r6a2_to_h5i7 >= 0
	r6a2_to_h5i8_exists: h5i8_exists - r6a2_to_h5i8 >= 0
	r6a2_to_h5i9_exists: h5i9_exists - r6a2_to_h5i9 >= 0
	r6a3_allocated: r6a3_to_h0i0 + r6a3_to_h0i1 + r6a3_to_h0i2 + r6a3_to_h0i3 + r6a3_to_h0i4 + r6a3_to_h0i5 + r6a3_to_h0i6 + r6a3_to_h0i7 + r6a3_to_h0i8 + r6a3_to_h0i9 + r6a3_to_h1i0 + r6a3_to_h1i1 + r6a3_to_h1i2 + r6a3_to_h1i3 + r6a3_to_h1i4 + r6a3_to_h1i5 + r6a3_to_h1i6 + r6a3_to_h1i7 + r6a3_to_h1i8 + r6a3_to_h1i9 + r6a3_to_h2i0 + r6a3_to_h2i1 + r6a3_to_h2i2 + r6a3_to_h2i3 + r6a3_to_h2i4 + r6a3_to_h2i5 + r6a3_to_h2i6 + r6a3_to_h2i7 + r6a3_to_h2i8 + r6a3_to_h2i9 + r6a3_to_h3i0 + r6a3_to_h3i1 + r6a3_to_h3i2 + r6a3_to_h3i3 + r6a3_to_h3i4 + r6a3_to_h3i5 + r6a3_to_h3i6 + r6a3_to_h3i7 + r6a3_to_h3i8 + r6a3_to_h3i9 + r6a3_to_h4i0 + r6a3_to_h4i1 + r6a3_to_h4i2 + r6a3_to_h4i3 + r6a3_to_h4i4 + r6a3_to_h4i5 + r6a3_to_h4i6 + r6a3_to_h4i7 + r6a3_to_h4i8 + r6a3_to_h4i9 + r6a3_to_h5i0 + r6a3_to_h5i1 + r6a3_to_h5i2 + r6a3_to_h5i3 + r6a3_to_h5i4 + r6a3_to_h5i5 + r6a3_to_h5i6 + r6a3_to_h5i7 + r6a3_to_h5i8 + r6a3_to_h5i9 = 1
	r6a3_to_h0i0_exists: h0i0_exists - r6a3_to_h0i0 >= 0
	r6a3_to_h0i1_exists: h0i1_exists - r6a3_to_h0i1 >= 0
	r6a3_to_h0i2_exists: h0i2_exists - r6a3_to_h0i2 >= 0
	r6a3_to_h0i3_exists: h0i3_exists - r6a3_to_h0i3 >= 0
	r6a3_to_h0i4_exists: h0i4_exists - r6a3_to_h0i4 >= 0
	r6a3_to_h0i5_exists: h0i5_exists - r6a3_to_h0i5 >= 0
	r6a3_to_h0i6_exists: h0i6_exists - r6a3_to_h0i6 >= 0
	r6a3_to_h0i7_exists: h0i7_exists - r6a3_to_h0i7 >= 0
	r6a3_to_h0i8_exists: h0i8_exists - r6a3_to_h0i8 >= 0
	r6a3_to_h0i9_exists: h0i9_exists - r6a3_to_h0i9 >= 0
	r6a3_to_h1i0_exists: h1i0_exists - r6a3_to_h1i0 >= 0
	r6a3_to_h1i1_exists: h1i1_exists - r6a3_to_h1i1 >= 0
	r6a3_to_h1i2_exists: h1i2_exists - r6a3_to_h1i2 >= 0
	r6a3_to_h1i3_exists: h1i3_exists - r6a3_to_h1i3 >= 0
	r6a3_to_h1i4_exists: h1i4_exists - r6a3_to_h1i4 >= 0
	r6a3_to_h1i5_exists: h1i5_exists - r6a3_to_h1i5 >= 0
	r6a3_to_h1i6_exists: h1i6_exists - r6a3_to_h1i6 >= 0
	r6a3_to_h1i7_exists: h1i7_exists - r6a3_to_h1i7 >= 0
	r6a3_to_h1i8_exists: h1i8_exists - r6a3_to_h1i8 >= 0
	r6a3_to_h1i9_exists: h1i9_exists - r6a3_to_h1i9 >= 0
	r6a3_to_h2i0_exists: h2i0_exists - r6a3_to_h2i0 >= 0
	r6a3_to_h2i1_exists: h2i1_exists - r6a3_to_h2i1 >= 0
	r6a3_to_h2i2_exists: h2i2_exists - r6a3_to_h2i2 >= 0
	r6a3_to_h2i3_exists: h2i3_exists - r6a3_to_h2i3 >= 0
	r6a3_to_h2i4_exists: h2i4_exists - r6a3_to_h2i4 >= 0
	r6a3_to_h2i5_exists: h2i5_exists - r6a3_to_h2i5 >= 0
	r6a3_to_h2i6_exists: h2i6_exists - r6a3_to_h2i6 >= 0
	r6a3_to_h2i7_exists: h2i7_exists - r6a3_to_h2i7 >= 0
	r6a3_to_h2i8_exists: h2i8_exists - r6a3_to_h2i8 >= 0
	r6a3_to_h2i9_exists: h2i9_exists - r6a3_to_h2i9 >= 0
	r6a3_to_h3i0_exists: h3i0_exists - r6a3_to_h3i0 >= 0
	r6a3_to_h3i1_exists: h3i1_exists - r6a3_to_h3i1 >= 0
	r6a3_to_h3i2_exists: h3i2_exists - r6a3_to_h3i2 >= 0
	r6a3_to_h3i3_exists: h3i3_exists - r6a3_to_h3i3 >= 0
	r6a3_to_h3i4_exists: h3i4_exists - r6a3_to_h3i4 >= 0
	r6a3_to_h3i5_exists: h3i5_exists - r6a3_to_h3i5 >= 0
	r6a3_to_h3i6_exists: h3i6_exists - r6a3_to_h3i6 >= 0
	r6a3_to_h3i7_exists: h3i7_exists - r6a3_to_h3i7 >= 0
	r6a3_to_h3i8_exists: h3i8_exists - r6a3_to_h3i8 >= 0
	r6a3_to_h3i9_exists: h3i9_exists - r6a3_to_h3i9 >= 0
	r6a3_to_h4i0_exists: h4i0_exists - r6a3_to_h4i0 >= 0
	r6a3_to_h4i1_exists: h4i1_exists - r6a3_to_h4i1 >= 0
	r6a3_to_h4i2_exists: h4i2_exists - r6a3_to_h4i2 >= 0
	r6a3_to_h4i3_exists: h4i3_exists - r6a3_to_h4i3 >= 0
	r6a3_to_h4i4_exists: h4i4_exists - r6a3_to_h4i4 >= 0
	r6a3_to_h4i5_exists: h4i5_exists - r6a3_to_h4i5 >= 0
	r6a3_to_h4i6_exists: h4i6_exists - r6a3_to_h4i6 >= 0
	r6a3_to_h4i7_exists: h4i7_exists - r6a3_to_h4i7 >= 0
	r6a3_to_h4i8_exists: h4i8_exists - r6a3_to_h4i8 >= 0
	r6a3_to_h4i9_exists: h4i9_exists - r6a3_to_h4i9 >= 0
	r6a3_to_h5i0_exists: h5i0_exists - r6a3_to_h5i0 >= 0
	r6a3_to_h5i1_exists: h5i1_exists - r6a3_to_h5i1 >= 0
	r6a3_to_h5i2_exists: h5i2_exists - r6a3_to_h5i2 >= 0
	r6a3_to_h5i3_exists: h5i3_exists - r6a3_to_h5i3 >= 0
	r6a3_to_h5i4_exists: h5i4_exists - r6a3_to_h5i4 >= 0
	r6a3_to_h5i5_exists: h5i5_exists - r6a3_to_h5i5 >= 0
	r6a3_to_h5i6_exists: h5i6_exists - r6a3_to_h5i6 >= 0
	r6a3_to_h5i7_exists: h5i7_exists - r6a3_to_h5i7 >= 0
	r6a3_to_h5i8_exists: h5i8_exists - r6a3_to_h5i8 >= 0
	r6a3_to_h5i9_exists: h5i9_exists - r6a3_to_h5i9 >= 0
	r7a0_allocated: r7a0_to_h0i0 + r7a0_to_h0i1 + r7a0_to_h0i2 + r7a0_to_h0i3 + r7a0_to_h0i4 + r7a0_to_h0i5 + r7a0_to_h0i6 + r7a0_to_h0i7 + r7a0_to_h0i8 + r7a0_to_h0i9 + r7a0_to_h1i0 + r7a0_to_h1i1 + r7a0_to_h1i2 + r7a0_to_h1i3 + r7a0_to_h1i4 + r7a0_to_h1i5 + r7a0_to_h1i6 + r7a0_to_h1i7 + r7a0_to_h1i8 + r7a0_to_h1i9 + r7a0_to_h2i0 + r7a0_to_h2i1 + r7a0_to_h2i2 + r7a0_to_h2i3 + r7a0_to_h2i4 + r7a0_to_h2i5 + r7a0_to_h2i6 + r7a0_to_h2i7 + r7a0_to_h2i8 + r7a0_to_h2i9 + r7a0_to_h3i0 + r7a0_to_h3i1 + r7a0_to_h3i2 + r7a0_to_h3i3 + r7a0_to_h3i4 + r7a0_to_h3i5 + r7a0_to_h3i6 + r7a0_to_h3i7 + r7a0_to_h3i8 + r7a0_to_h3i9 + r7a0_to_h4i0 + r7a0_to_h4i1 + r7a0_to_h4i2 + r7a0_to_h4i3 + r7a0_to_h4i4 + r7a0_to_h4i5 + r7a0_to_h4i6 + r7a0_to_h4i7 + r7a0_to_h4i8 + r7a0_to_h4i9 + r7a0_to_h5i0 + r7a0_to_h5i1 + r7a0_to_h5i2 + r7a0_to_h5i3 + r7a0_to_h5i4 + r7a0_to_h5i5 + r7a0_to_h5i6 + r7a0_to_h5i7 + r7a0_to_h5i8 + r7a0_to_h5i9 = 1
	r7a0_to_h0i0_exists: h0i0_exists - r7a0_to_h0i0 >= 0
	r7a0_to_h0i1_exists: h0i1_exists - r7a0_to_h0i1 >= 0
	r7a0_to_h0i2_exists: h0i2_exists - r7a0_to_h0i2 >= 0
	r7a0_to_h0i3_exists: h0i3_exists - r7a0_to_h0i3 >= 0
	r7a0_to_h0i4_exists: h0i4_exists - r7a0_to_h0i4 >= 0
	r7a0_to_h0i5_exists: h0i5_exists - r7a0_to_h0i5 >= 0
	r7a0_to_h0i6_exists: h0i6_exists - r7a0_to_h0i6 >= 0
	r7a0_to_h0i7_exists: h0i7_exists - r7a0_to_h0i7 >= 0
	r7a0_to_h0i8_exists: h0i8_exists - r7a0_to_h0i8 >= 0
	r7a0_to_h0i9_exists: h0i9_exists - r7a0_to_h0i9 >= 0
	r7a0_to_h1i0_exists: h1i0_exists - r7a0_to_h1i0 >= 0
	r7a0_to_h1i1_exists: h1i1_exists - r7a0_to_h1i1 >= 0
	r7a0_to_h1i2_exists: h1i2_exists - r7a0_to_h1i2 >= 0
	r7a0_to_h1i3_exists: h1i3_exists - r7a0_to_h1i3 >= 0
	r7a0_to_h1i4_exists: h1i4_exists - r7a0_to_h1i4 >= 0
	r7a0_to_h1i5_exists: h1i5_exists - r7a0_to_h1i5 >= 0
	r7a0_to_h1i6_exists: h1i6_exists - r7a0_to_h1i6 >= 0
	r7a0_to_h1i7_exists: h1i7_exists - r7a0_to_h1i7 >= 0
	r7a0_to_h1i8_exists: h1i8_exists - r7a0_to_h1i8 >= 0
	r7a0_to_h1i9_exists: h1i9_exists - r7a0_to_h1i9 >= 0
	r7a0_to_h2i0_exists: h2i0_exists - r7a0_to_h2i0 >= 0
	r7a0_to_h2i1_exists: h2i1_exists - r7a0_to_h2i1 >= 0
	r7a0_to_h2i2_exists: h2i2_exists - r7a0_to_h2i2 >= 0
	r7a0_to_h2i3_exists: h2i3_exists - r7a0_to_h2i3 >= 0
	r7a0_to_h2i4_exists: h2i4_exists - r7a0_to_h2i4 >= 0
	r7a0_to_h2i5_exists: h2i5_exists - r7a0_to_h2i5 >= 0
	r7a0_to_h2i6_exists: h2i6_exists - r7a0_to_h2i6 >= 0
	r7a0_to_h2i7_exists: h2i7_exists - r7a0_to_h2i7 >= 0
	r7a0_to_h2i8_exists: h2i8_exists - r7a0_to_h2i8 >= 0
	r7a0_to_h2i9_exists: h2i9_exists - r7a0_to_h2i9 >= 0
	r7a0_to_h3i0_exists: h3i0_exists - r7a0_to_h3i0 >= 0
	r7a0_to_h3i1_exists: h3i1_exists - r7a0_to_h3i1 >= 0
	r7a0_to_h3i2_exists: h3i2_exists - r7a0_to_h3i2 >= 0
	r7a0_to_h3i3_exists: h3i3_exists - r7a0_to_h3i3 >= 0
	r7a0_to_h3i4_exists: h3i4_exists - r7a0_to_h3i4 >= 0
	r7a0_to_h3i5_exists: h3i5_exists - r7a0_to_h3i5 >= 0
	r7a0_to_h3i6_exists: h3i6_exists - r7a0_to_h3i6 >= 0
	r7a0_to_h3i7_exists: h3i7_exists - r7a0_to_h3i7 >= 0
	r7a0_to_h3i8_exists: h3i8_exists - r7a0_to_h3i8 >= 0
	r7a0_to_h3i9_exists: h3i9_exists - r7a0_to_h3i9 >= 0
	r7a0_to_h4i0_exists: h4i0_exists - r7a0_to_h4i0 >= 0
	r7a0_to_h4i1_exists: h4i1_exists - r7a0_to_h4i1 >= 0
	r7a0_to_h4i2_exists: h4i2_exists - r7a0_to_h4i2 >= 0
	r7a0_to_h4i3_exists: h4i3_exists - r7a0_to_h4i3 >= 0
	r7a0_to_h4i4_exists: h4i4_exists - r7a0_to_h4i4 >= 0
	r7a0_to_h4i5_exists: h4i5_exists - r7a0_to_h4i5 >= 0
	r7a0_to_h4i6_exists: h4i6_exists - r7a0_to_h4i6 >= 0
	r7a0_to_h4i7_exists: h4i7_exists - r7a0_to_h4i7 >= 0
	r7a0_to_h4i8_exists: h4i8_exists - r7a0_to_h4i8 >= 0
	r7a0_to_h4i9_exists: h4i9_exists - r7a0_to_h4i9 >= 0
	r7a0_to_h5i0_exists: h5i0_exists - r7a0_to_h5i0 >= 0
	r7a0_to_h5i1_exists: h5i1_exists - r7a0_to_h5i1 >= 0
	r7a0_to_h5i2_exists: h5i2_exists - r7a0_to_h5i2 >= 0
	r7a0_to_h5i3_exists: h5i3_exists - r7a0_to_h5i3 >= 0
	r7a0_to_h5i4_exists: h5i4_exists - r7a0_to_h5i4 >= 0
	r7a0_to_h5i5_exists: h5i5_exists - r7a0_to_h5i5 >= 0
	r7a0_to_h5i6_exists: h5i6_exists - r7a0_to_h5i6 >= 0
	r7a0_to_h5i7_exists: h5i7_exists - r7a0_to_h5i7 >= 0
	r7a0_to_h5i8_exists: h5i8_exists - r7a0_to_h5i8 >= 0
	r7a0_to_h5i9_exists: h5i9_exists - r7a0_to_h5i9 >= 0
	r7a1_allocated: r7a1_to_h0i0 + r7a1_to_h0i1 + r7a1_to_h0i2 + r7a1_to_h0i3 + r7a1_to_h0i4 + r7a1_to_h0i5 + r7a1_to_h0i6 + r7a1_to_h0i7 + r7a1_to_h0i8 + r7a1_to_h0i9 + r7a1_to_h1i0 + r7a1_to_h1i1 + r7a1_to_h1i2 + r7a1_to_h1i3 + r7a1_to_h1i4 + r7a1_to_h1i5 + r7a1_to_h1i6 + r7a1_to_h1i7 + r7a1_to_h1i8 + r7a1_to_h1i9 + r7a1_to_h2i0 + r7a1_to_h2i1 + r7a1_to_h2i2 + r7a1_to_h2i3 + r7a1_to_h2i4 + r7a1_to_h2i5 + r7a1_to_h2i6 + r7a1_to_h2i7 + r7a1_to_h2i8 + r7a1_to_h2i9 + r7a1_to_h3i0 + r7a1_to_h3i1 + r7a1_to_h3i2 + r7a1_to_h3i3 + r7a1_to_h3i4 + r7a1_to_h3i5 + r7a1_to_h3i6 + r7a1_to_h3i7 + r7a1_to_h3i8 + r7a1_to_h3i9 + r7a1_to_h4i0 + r7a1_to_h4i1 + r7a1_to_h4i2 + r7a1_to_h4i3 + r7a1_to_h4i4 + r7a1_to_h4i5 + r7a1_to_h4i6 + r7a1_to_h4i7 + r7a1_to_h4i8 + r7a1_to_h4i9 + r7a1_to_h5i0 + r7a1_to_h5i1 + r7a1_to_h5i2 + r7a1_to_h5i3 + r7a1_to_h5i4 + r7a1_to_h5i5 + r7a1_to_h5i6 + r7a1_to_h5i7 + r7a1_to_h5i8 + r7a1_to_h5i9 = 1
	r7a1_to_h0i0_exists: h0i0_exists - r7a1_to_h0i0 >= 0
	r7a1_to_h0i1_exists: h0i1_exists - r7a1_to_h0i1 >= 0
	r7a1_to_h0i2_exists: h0i2_exists - r7a1_to_h0i2 >= 0
	r7a1_to_h0i3_exists: h0i3_exists - r7a1_to_h0i3 >= 0
	r7a1_to_h0i4_exists: h0i4_exists - r7a1_to_h0i4 >= 0
	r7a1_to_h0i5_exists: h0i5_exists - r7a1_to_h0i5 >= 0
	r7a1_to_h0i6_exists: h0i6_exists - r7a1_to_h0i6 >= 0
	r7a1_to_h0i7_exists: h0i7_exists - r7a1_to_h0i7 >= 0
	r7a1_to_h0i8_exists: h0i8_exists - r7a1_to_h0i8 >= 0
	r7a1_to_h0i9_exists: h0i9_exists - r7a1_to_h0i9 >= 0
	r7a1_to_h1i0_exists: h1i0_exists - r7a1_to_h1i0 >= 0
	r7a1_to_h1i1_exists: h1i1_exists - r7a1_to_h1i1 >= 0
	r7a1_to_h1i2_exists: h1i2_exists - r7a1_to_h1i2 >= 0
	r7a1_to_h1i3_exists: h1i3_exists - r7a1_to_h1i3 >= 0
	r7a1_to_h1i4_exists: h1i4_exists - r7a1_to_h1i4 >= 0
	r7a1_to_h1i5_exists: h1i5_exists - r7a1_to_h1i5 >= 0
	r7a1_to_h1i6_exists: h1i6_exists - r7a1_to_h1i6 >= 0
	r7a1_to_h1i7_exists: h1i7_exists - r7a1_to_h1i7 >= 0
	r7a1_to_h1i8_exists: h1i8_exists - r7a1_to_h1i8 >= 0
	r7a1_to_h1i9_exists: h1i9_exists - r7a1_to_h1i9 >= 0
	r7a1_to_h2i0_exists: h2i0_exists - r7a1_to_h2i0 >= 0
	r7a1_to_h2i1_exists: h2i1_exists - r7a1_to_h2i1 >= 0
	r7a1_to_h2i2_exists: h2i2_exists - r7a1_to_h2i2 >= 0
	r7a1_to_h2i3_exists: h2i3_exists - r7a1_to_h2i3 >= 0
	r7a1_to_h2i4_exists: h2i4_exists - r7a1_to_h2i4 >= 0
	r7a1_to_h2i5_exists: h2i5_exists - r7a1_to_h2i5 >= 0
	r7a1_to_h2i6_exists: h2i6_exists - r7a1_to_h2i6 >= 0
	r7a1_to_h2i7_exists: h2i7_exists - r7a1_to_h2i7 >= 0
	r7a1_to_h2i8_exists: h2i8_exists - r7a1_to_h2i8 >= 0
	r7a1_to_h2i9_exists: h2i9_exists - r7a1_to_h2i9 >= 0
	r7a1_to_h3i0_exists: h3i0_exists - r7a1_to_h3i0 >= 0
	r7a1_to_h3i1_exists: h3i1_exists - r7a1_to_h3i1 >= 0
	r7a1_to_h3i2_exists: h3i2_exists - r7a1_to_h3i2 >= 0
	r7a1_to_h3i3_exists: h3i3_exists - r7a1_to_h3i3 >= 0
	r7a1_to_h3i4_exists: h3i4_exists - r7a1_to_h3i4 >= 0
	r7a1_to_h3i5_exists: h3i5_exists - r7a1_to_h3i5 >= 0
	r7a1_to_h3i6_exists: h3i6_exists - r7a1_to_h3i6 >= 0
	r7a1_to_h3i7_exists: h3i7_exists - r7a1_to_h3i7 >= 0
	r7a1_to_h3i8_exists: h3i8_exists - r7a1_to_h3i8 >= 0
	r7a1_to_h3i9_exists: h3i9_exists - r7a1_to_h3i9 >= 0
	r7a1_to_h4i0_exists: h4i0_exists - r7a1_to_h4i0 >= 0
	r7a1_to_h4i1_exists: h4i1_exists - r7a1_to_h4i1 >= 0
	r7a1_to_h4i2_exists: h4i2_exists - r7a1_to_h4i2 >= 0
	r7a1_to_h4i3_exists: h4i3_exists - r7a1_to_h4i3 >= 0
	r7a1_to_h4i4_exists: h4i4_exists - r7a1_to_h4i4 >= 0
	r7a1_to_h4i5_exists: h4i5_exists - r7a1_to_h4i5 >= 0
	r7a1_to_h4i6_exists: h4i6_exists - r7a1_to_h4i6 >= 0
	r7a1_to_h4i7_exists: h4i7_exists - r7a1_to_h4i7 >= 0
	r7a1_to_h4i8_exists: h4i8_exists - r7a1_to_h4i8 >= 0
	r7a1_to_h4i9_exists: h4i9_exists - r7a1_to_h4i9 >= 0
	r7a1_to_h5i0_exists: h5i0_exists - r7a1_to_h5i0 >= 0
	r7a1_to_h5i1_exists: h5i1_exists - r7a1_to_h5i1 >= 0
	r7a1_to_h5i2_exists: h5i2_exists - r7a1_to_h5i2 >= 0
	r7a1_to_h5i3_exists: h5i3_exists - r7a1_to_h5i3 >= 0
	r7a1_to_h5i4_exists: h5i4_exists - r7a1_to_h5i4 >= 0
	r7a1_to_h5i5_exists: h5i5_exists - r7a1_to_h5i5 >= 0
	r7a1_to_h5i6_exists: h5i6_exists - r7a1_to_h5i6 >= 0
	r7a1_to_h5i7_exists: h5i7_exists - r7a1_to_h5i7 >= 0
	r7a1_to_h5i8_exists: h5i8_exists - r7a1_to_h5i8 >= 0
	r7a1_to_h5i9_exists: h5i9_exists - r7a1_to_h5i9 >= 0
	r7a2_allocated: r7a2_to_h0i0 + r7a2_to_h0i1 + r7a2_to_h0i2 + r7a2_to_h0i3 + r7a2_to_h0i4 + r7a2_to_h0i5 + r7a2_to_h0i6 + r7a2_to_h0i7 + r7a2_to_h0i8 + r7a2_to_h0i9 + r7a2_to_h1i0 + r7a2_to_h1i1 + r7a2_to_h1i2 + r7a2_to_h1i3 + r7a2_to_h1i4 + r7a2_to_h1i5 + r7a2_to_h1i6 + r7a2_to_h1i7 + r7a2_to_h1i8 + r7a2_to_h1i9 + r7a2_to_h2i0 + r7a2_to_h2i1 + r7a2_to_h2i2 + r7a2_to_h2i3 + r7a2_to_h2i4 + r7a2_to_h2i5 + r7a2_to_h2i6 + r7a2_to_h2i7 + r7a2_to_h2i8 + r7a2_to_h2i9 + r7a2_to_h3i0 + r7a2_to_h3i1 + r7a2_to_h3i2 + r7a2_to_h3i3 + r7a2_to_h3i4 + r7a2_to_h3i5 + r7a2_to_h3i6 + r7a2_to_h3i7 + r7a2_to_h3i8 + r7a2_to_h3i9 + r7a2_to_h4i0 + r7a2_to_h4i1 + r7a2_to_h4i2 + r7a2_to_h4i3 + r7a2_to_h4i4 + r7a2_to_h4i5 + r7a2_to_h4i6 + r7a2_to_h4i7 + r7a2_to_h4i8 + r7a2_to_h4i9 + r7a2_to_h5i0 + r7a2_to_h5i1 + r7a2_to_h5i2 + r7a2_to_h5i3 + r7a2_to_h5i4 + r7a2_to_h5i5 + r7a2_to_h5i6 + r7a2_to_h5i7 + r7a2_to_h5i8 + r7a2_to_h5i9 = 1
	r7a2_to_h0i0_exists: h0i0_exists - r7a2_to_h0i0 >= 0
	r7a2_to_h0i1_exists: h0i1_exists - r7a2_to_h0i1 >= 0
	r7a2_to_h0i2_exists: h0i2_exists - r7a2_to_h0i2 >= 0
	r7a2_to_h0i3_exists: h0i3_exists - r7a2_to_h0i3 >= 0
	r7a2_to_h0i4_exists: h0i4_exists - r7a2_to_h0i4 >= 0
	r7a2_to_h0i5_exists: h0i5_exists - r7a2_to_h0i5 >= 0
	r7a2_to_h0i6_exists: h0i6_exists - r7a2_to_h0i6 >= 0
	r7a2_to_h0i7_exists: h0i7_exists - r7a2_to_h0i7 >= 0
	r7a2_to_h0i8_exists: h0i8_exists - r7a2_to_h0i8 >= 0
	r7a2_to_h0i9_exists: h0i9_exists - r7a2_to_h0i9 >= 0
	r7a2_to_h1i0_exists: h1i0_exists - r7a2_to_h1i0 >= 0
	r7a2_to_h1i1_exists: h1i1_exists - r7a2_to_h1i1 >= 0
	r7a2_to_h1i2_exists: h1i2_exists - r7a2_to_h1i2 >= 0
	r7a2_to_h1i3_exists: h1i3_exists - r7a2_to_h1i3 >= 0
	r7a2_to_h1i4_exists: h1i4_exists - r7a2_to_h1i4 >= 0
	r7a2_to_h1i5_exists: h1i5_exists - r7a2_to_h1i5 >= 0
	r7a2_to_h1i6_exists: h1i6_exists - r7a2_to_h1i6 >= 0
	r7a2_to_h1i7_exists: h1i7_exists - r7a2_to_h1i7 >= 0
	r7a2_to_h1i8_exists: h1i8_exists - r7a2_to_h1i8 >= 0
	r7a2_to_h1i9_exists: h1i9_exists - r7a2_to_h1i9 >= 0
	r7a2_to_h2i0_exists: h2i0_exists - r7a2_to_h2i0 >= 0
	r7a2_to_h2i1_exists: h2i1_exists - r7a2_to_h2i1 >= 0
	r7a2_to_h2i2_exists: h2i2_exists - r7a2_to_h2i2 >= 0
	r7a2_to_h2i3_exists: h2i3_exists - r7a2_to_h2i3 >= 0
	r7a2_to_h2i4_exists: h2i4_exists - r7a2_to_h2i4 >= 0
	r7a2_to_h2i5_exists: h2i5_exists - r7a2_to_h2i5 >= 0
	r7a2_to_h2i6_exists: h2i6_exists - r7a2_to_h2i6 >= 0
	r7a2_to_h2i7_exists: h2i7_exists - r7a2_to_h2i7 >= 0
	r7a2_to_h2i8_exists: h2i8_exists - r7a2_to_h2i8 >= 0
	r7a2_to_h2i9_exists: h2i9_exists - r7a2_to_h2i9 >= 0
	r7a2_to_h3i0_exists: h3i0_exists - r7a2_to_h3i0 >= 0
	r7a2_to_h3i1_exists: h3i1_exists - r7a2_to_h3i1 >= 0
	r7a2_to_h3i2_exists: h3i2_exists - r7a2_to_h3i2 >= 0
	r7a2_to_h3i3_exists: h3i3_exists - r7a2_to_h3i3 >= 0
	r7a2_to_h3i4_exists: h3i4_exists - r7a2_to_h3i4 >= 0
	r7a2_to_h3i5_exists: h3i5_exists - r7a2_to_h3i5 >= 0
	r7a2_to_h3i6_exists: h3i6_exists - r7a2_to_h3i6 >= 0
	r7a2_to_h3i7_exists: h3i7_exists - r7a2_to_h3i7 >= 0
	r7a2_to_h3i8_exists: h3i8_exists - r7a2_to_h3i8 >= 0
	r7a2_to_h3i9_exists: h3i9_exists - r7a2_to_h3i9 >= 0
	r7a2_to_h4i0_exists: h4i0_exists - r7a2_to_h4i0 >= 0
	r7a2_to_h4i1_exists: h4i1_exists - r7a2_to_h4i1 >= 0
	r7a2_to_h4i2_exists: h4i2_exists - r7a2_to_h4i2 >= 0
	r7a2_to_h4i3_exists: h4i3_exists - r7a2_to_h4i3 >= 0
	r7a2_to_h4i4_exists: h4i4_exists - r7a2_to_h4i4 >= 0
	r7a2_to_h4i5_exists: h4i5_exists - r7a2_to_h4i5 >= 0
	r7a2_to_h4i6_exists: h4i6_exists - r7a2_to_h4i6 >= 0
	r7a2_to_h4i7_exists: h4i7_exists - r7a2_to_h4i7 >= 0
	r7a2_to_h4i8_exists: h4i8_exists - r7a2_to_h4i8 >= 0
	r7a2_to_h4i9_exists: h4i9_exists - r7a2_to_h4i9 >= 0
	r7a2_to_h5i0_exists: h5i0_exists - r7a2_to_h5i0 >= 0
	r7a2_to_h5i1_exists: h5i1_exists - r7a2_to_h5i1 >= 0
	r7a2_to_h5i2_exists: h5i2_exists - r7a2_to_h5i2 >= 0
	r7a2_to_h5i3_exists: h5i3_exists - r7a2_to_h5i3 >= 0
	r7a2_to_h5i4_exists: h5i4_exists - r7a2_to_h5i4 >= 0
	r7a2_to_h5i5_exists: h5i5_exists - r7a2_to_h5i5 >= 0
	r7a2_to_h5i6_exists: h5i6_exists - r7a2_to_h5i6 >= 0
	r7a2_to_h5i7_exists: h5i7_exists - r7a2_to_h5i7 >= 0
	r7a2_to_h5i8_exists: h5i8_exists - r7a2_to_h5i8 >= 0
	r7a2_to_h5i9_exists: h5i9_exists - r7a2_to_h5i9 >= 0
	h0i0_mem_use: 2 r1a0_to_h0i0 + 2 r1a1_to_h0i0 + 2 r1a2_to_h0i0 + 3 r2a0_to_h0i0 + 3 r3a0_to_h0i0 + 2 r5a0_to_h0i0 + 3 r6a0_to_h0i0 + 3 r6a1_to_h0i0 + 3 r6a2_to_h0i0 + 3 r6a3_to_h0i0 + 3 r7a0_to_h0i0 + 3 r7a1_to_h0i0 + 3 r7a2_to_h0i0 - 8 h0i0_mem = 0
	h0i0_hdd_use: 4 r1a0_to_h0i0 + 4 r1a1_to_h0i0 + 4 r1a2_to_h0i0 + 5 r2a0_to_h0i0 + 17 r3a0_to_h0i0 + 4 r5a0_to_h0i0 + 5 r6a0_to_h0i0 + 5 r6a1_to_h0i0 + 5 r6a2_to_h0i0 + 5 r6a3_to_h0i0 + 17 r7a0_to_h0i0 + 17 r7a1_to_h0i0 + 17 r7a2_to_h0i0 - 75 h0i0_hdd = 0
	h0i1_mem_use: 2 r1a0_to_h0i1 + 2 r1a1_to_h0i1 + 2 r1a2_to_h0i1 + 3 r2a0_to_h0i1 + 3 r3a0_to_h0i1 + 2 r5a0_to_h0i1 + 3 r6a0_to_h0i1 + 3 r6a1_to_h0i1 + 3 r6a2_to_h0i1 + 3 r6a3_to_h0i1 + 3 r7a0_to_h0i1 + 3 r7a1_to_h0i1 + 3 r7a2_to_h0i1 - 8 h0i1_mem = 0
	h0i1_hdd_use: 4 r1a0_to_h0i1 + 4 r1a1_to_h0i1 + 4 r1a2_to_h0i1 + 5 r2a0_to_h0i1 + 17 r3a0_to_h0i1 + 4 r5a0_to_h0i1 + 5 r6a0_to_h0i1 + 5 r6a1_to_h0i1 + 5 r6a2_to_h0i1 + 5 r6a3_to_h0i1 + 17 r7a0_to_h0i1 + 17 r7a1_to_h0i1 + 17 r7a2_to_h0i1 - 75 h0i1_hdd = 0
	h0i2_mem_use: 2 r1a0_to_h0i2 + 2 r1a1_to_h0i2 + 2 r1a2_to_h0i2 + 3 r2a0_to_h0i2 + 3 r3a0_to_h0i2 + 2 r5a0_to_h0i2 + 3 r6a0_to_h0i2 + 3 r6a1_to_h0i2 + 3 r6a2_to_h0i2 + 3 r6a3_to_h0i2 + 3 r7a0_to_h0i2 + 3 r7a1_to_h0i2 + 3 r7a2_to_h0i2 - 8 h0i2_mem = 0
	h0i2_hdd_use: 4 r1a0_to_h0i2 + 4 r1a1_to_h0i2 + 4 r1a2_to_h0i2 + 5 r2a0_to_h0i2 + 17 r3a0_to_h0i2 + 4 r5a0_to_h0i2 + 5 r6a0_to_h0i2 + 5 r6a1_to_h0i2 + 5 r6a2_to_h0i2 + 5 r6a3_to_h0i2 + 17 r7a0_to_h0i2 + 17 r7a1_to_h0i2 + 17 r7a2_to_h0i2 - 75 h0i2_hdd = 0
	h0i3_mem_use: 2 r1a0_to_h0i3 + 2 r1a1_to_h0i3 + 2 r1a2_to_h0i3 + 3 r2a0_to_h0i3 + 3 r3a0_to_h0i3 + 2 r5a0_to_h0i3 + 3 r6a0_to_h0i3 + 3 r6a1_to_h0i3 + 3 r6a2_to_h0i3 + 3 r6a3_to_h0i3 + 3 r7a0_to_h0i3 + 3 r7a1_to_h0i3 + 3 r7a2_to_h0i3 - 8 h0i3_mem = 0
	h0i3_hdd_use: 4 r1a0_to_h0i3 + 4 r1a1_to_h0i3 + 4 r1a2_to_h0i3 + 5 r2a0_to_h0i3 + 17 r3a0_to_h0i3 + 4 r5a0_to_h0i3 + 5 r6a0_to_h0i3 + 5 r6a1_to_h0i3 + 5 r6a2_to_h0i3 + 5 r6a3_to_h0i3 + 17 r7a0_to_h0i3 + 17 r7a1_to_h0i3 + 17 r7a2_to_h0i3 - 75 h0i3_hdd = 0
	h0i4_mem_use: 2 r1a0_to_h0i4 + 2 r1a1_to_h0i4 + 2 r1a2_to_h0i4 + 3 r2a0_to_h0i4 + 3 r3a0_to_h0i4 + 2 r5a0_to_h0i4 + 3 r6a0_to_h0i4 + 3 r6a1_to_h0i4 + 3 r6a2_to_h0i4 + 3 r6a3_to_h0i4 + 3 r7a0_to_h0i4 + 3 r7a1_to_h0i4 + 3 r7a2_to_h0i4 - 8 h0i4_mem = 0
	h0i4_hdd_use: 4 r1a0_to_h0i4 + 4 r1a1_to_h0i4 + 4 r1a2_to_h0i4 + 5 r2a0_to_h0i4 + 17 r3a0_to_h0i4 + 4 r5a0_to_h0i4 + 5 r6a0_to_h0i4 + 5 r6a1_to_h0i4 + 5 r6a2_to_h0i4 + 5 r6a3_to_h0i4 + 17 r7a0_to_h0i4 + 17 r7a1_to_h0i4 + 17 r7a2_to_h0i4 - 75 h0i4_hdd = 0
	h0i5_mem_use: 2 r1a0_to_h0i5 + 2 r1a1_to_h0i5 + 2 r1a2_to_h0i5 + 3 r2a0_to_h0i5 + 3 r3a0_to_h0i5 + 2 r5a0_to_h0i5 + 3 r6a0_to_h0i5 + 3 r6a1_to_h0i5 + 3 r6a2_to_h0i5 + 3 r6a3_to_h0i5 + 3 r7a0_to_h0i5 + 3 r7a1_to_h0i5 + 3 r7a2_to_h0i5 - 8 h0i5_mem = 0
	h0i5_hdd_use: 4 r1a0_to_h0i5 + 4 r1a1_to_h0i5 + 4 r1a2_to_h0i5 + 5 r2a0_to_h0i5 + 17 r3a0_to_h0i5 + 4 r5a0_to_h0i5 + 5 r6a0_to_h0i5 + 5 r6a1_to_h0i5 + 5 r6a2_to_h0i5 + 5 r6a3_to_h0i5 + 17 r7a0_to_h0i5 + 17 r7a1_to_h0i5 + 17 r7a2_to_h0i5 - 75 h0i5_hdd = 0
	h0i6_mem_use: 2 r1a0_to_h0i6 + 2 r1a1_to_h0i6 + 2 r1a2_to_h0i6 + 3 r2a0_to_h0i6 + 3 r3a0_to_h0i6 + 2 r5a0_to_h0i6 + 3 r6a0_to_h0i6 + 3 r6a1_to_h0i6 + 3 r6a2_to_h0i6 + 3 r6a3_to_h0i6 + 3 r7a0_to_h0i6 + 3 r7a1_to_h0i6 + 3 r7a2_to_h0i6 - 8 h0i6_mem = 0
	h0i6_hdd_use: 4 r1a0_to_h0i6 + 4 r1a1_to_h0i6 + 4 r1a2_to_h0i6 + 5 r2a0_to_h0i6 + 17 r3a0_to_h0i6 + 4 r5a0_to_h0i6 + 5 r6a0_to_h0i6 + 5 r6a1_to_h0i6 + 5 r6a2_to_h0i6 + 5 r6a3_to_h0i6 + 17 r7a0_to_h0i6 + 17 r7a1_to_h0i6 + 17 r7a2_to_h0i6 - 75 h0i6_hdd = 0
	h0i7_mem_use: 2 r1a0_to_h0i7 + 2 r1a1_to_h0i7 + 2 r1a2_to_h0i7 + 3 r2a0_to_h0i7 + 3 r3a0_to_h0i7 + 2 r5a0_to_h0i7 + 3 r6a0_to_h0i7 + 3 r6a1_to_h0i7 + 3 r6a2_to_h0i7 + 3 r6a3_to_h0i7 + 3 r7a0_to_h0i7 + 3 r7a1_to_h0i7 + 3 r7a2_to_h0i7 - 8 h0i7_mem = 0
	h0i7_hdd_use: 4 r1a0_to_h0i7 + 4 r1a1_to_h0i7 + 4 r1a2_to_h0i7 + 5 r2a0_to_h0i7 + 17 r3a0_to_h0i7 + 4 r5a0_to_h0i7 + 5 r6a0_to_h0i7 + 5 r6a1_to_h0i7 + 5 r6a2_to_h0i7 + 5 r6a3_to_h0i7 + 17 r7a0_to_h0i7 + 17 r7a1_to_h0i7 + 17 r7a2_to_h0i7 - 75 h0i7_hdd = 0
	h0i8_mem_use: 2 r1a0_to_h0i8 + 2 r1a1_to_h0i8 + 2 r1a2_to_h0i8 + 3 r2a0_to_h0i8 + 3 r3a0_to_h0i8 + 2 r5a0_to_h0i8 + 3 r6a0_to_h0i8 + 3 r6a1_to_h0i8 + 3 r6a2_to_h0i8 + 3 r6a3_to_h0i8 + 3 r7a0_to_h0i8 + 3 r7a1_to_h0i8 + 3 r7a2_to_h0i8 - 8 h0i8_mem = 0
	h0i8_hdd_use: 4 r1a0_to_h0i8 + 4 r1a1_to_h0i8 + 4 r1a2_to_h0i8 + 5 r2a0_to_h0i8 + 17 r3a0_to_h0i8 + 4 r5a0_to_h0i8 + 5 r6a0_to_h0i8 + 5 r6a1_to_h0i8 + 5 r6a2_to_h0i8 + 5 r6a3_to_h0i8 + 17 r7a0_to_h0i8 + 17 r7a1_to_h0i8 + 17 r7a2_to_h0i8 - 75 h0i8_hdd = 0
	h0i9_mem_use: 2 r1a0_to_h0i9 + 2 r1a1_to_h0i9 + 2 r1a2_to_h0i9 + 3 r2a0_to_h0i9 + 3 r3a0_to_h0i9 + 2 r5a0_to_h0i9 + 3 r6a0_to_h0i9 + 3 r6a1_to_h0i9 + 3 r6a2_to_h0i9 + 3 r6a3_to_h0i9 + 3 r7a0_to_h0i9 + 3 r7a1_to_h0i9 + 3 r7a2_to_h0i9 - 8 h0i9_mem = 0
	h0i9_hdd_use: 4 r1a0_to_h0i9 + 4 r1a1_to_h0i9 + 4 r1a2_to_h0i9 + 5 r2a0_to_h0i9 + 17 r3a0_to_h0i9 + 4 r5a0_to_h0i9 + 5 r6a0_to_h0i9 + 5 r6a1_to_h0i9 + 5 r6a2_to_h0i9 + 5 r6a3_to_h0i9 + 17 r7a0_to_h0i9 + 17 r7a1_to_h0i9 + 17 r7a2_to_h0i9 - 75 h0i9_hdd = 0
	h1i0_mem_use: 2 r1a0_to_h1i0 + 2 r1a1_to_h1i0 + 2 r1a2_to_h1i0 + 3 r2a0_to_h1i0 + 3 r3a0_to_h1i0 + 2 r5a0_to_h1i0 + 3 r6a0_to_h1i0 + 3 r6a1_to_h1i0 + 3 r6a2_to_h1i0 + 3 r6a3_to_h1i0 + 3 r7a0_to_h1i0 + 3 r7a1_to_h1i0 + 3 r7a2_to_h1i0 - 16 h1i0_mem = 0
	h1i0_hdd_use: 4 r1a0_to_h1i0 + 4 r1a1_to_h1i0 + 4 r1a2_to_h1i0 + 5 r2a0_to_h1i0 + 17 r3a0_to_h1i0 + 4 r5a0_to_h1i0 + 5 r6a0_to_h1i0 + 5 r6a1_to_h1i0 + 5 r6a2_to_h1i0 + 5 r6a3_to_h1i0 + 17 r7a0_to_h1i0 + 17 r7a1_to_h1i0 + 17 r7a2_to_h1i0 - 150 h1i0_hdd = 0
	h1i1_mem_use: 2 r1a0_to_h1i1 + 2 r1a1_to_h1i1 + 2 r1a2_to_h1i1 + 3 r2a0_to_h1i1 + 3 r3a0_to_h1i1 + 2 r5a0_to_h1i1 + 3 r6a0_to_h1i1 + 3 r6a1_to_h1i1 + 3 r6a2_to_h1i1 + 3 r6a3_to_h1i1 + 3 r7a0_to_h1i1 + 3 r7a1_to_h1i1 + 3 r7a2_to_h1i1 - 16 h1i1_mem = 0
	h1i1_hdd_use: 4 r1a0_to_h1i1 + 4 r1a1_to_h1i1 + 4 r1a2_to_h1i1 + 5 r2a0_to_h1i1 + 17 r3a0_to_h1i1 + 4 r5a0_to_h1i1 + 5 r6a0_to_h1i1 + 5 r6a1_to_h1i1 + 5 r6a2_to_h1i1 + 5 r6a3_to_h1i1 + 17 r7a0_to_h1i1 + 17 r7a1_to_h1i1 + 17 r7a2_to_h1i1 - 150 h1i1_hdd = 0
	h1i2_mem_use: 2 r1a0_to_h1i2 + 2 r1a1_to_h1i2 + 2 r1a2_to_h1i2 + 3 r2a0_to_h1i2 + 3 r3a0_to_h1i2 + 2 r5a0_to_h1i2 + 3 r6a0_to_h1i2 + 3 r6a1_to_h1i2 + 3 r6a2_to_h1i2 + 3 r6a3_to_h1i2 + 3 r7a0_to_h1i2 + 3 r7a1_to_h1i2 + 3 r7a2_to_h1i2 - 16 h1i2_mem = 0
	h1i2_hdd_use: 4 r1a0_to_h1i2 + 4 r1a1_to_h1i2 + 4 r1a2_to_h1i2 + 5 r2a0_to_h1i2 + 17 r3a0_to_h1i2 + 4 r5a0_to_h1i2 + 5 r6a0_to_h1i2 + 5 r6a1_to_h1i2 + 5 r6a2_to_h1i2 + 5 r6a3_to_h1i2 + 17 r7a0_to_h1i2 + 17 r7a1_to_h1i2 + 17 r7a2_to_h1i2 - 150 h1i2_hdd = 0
	h1i3_mem_use: 2 r1a0_to_h1i3 + 2 r1a1_to_h1i3 + 2 r1a2_to_h1i3 + 3 r2a0_to_h1i3 + 3 r3a0_to_h1i3 + 2 r5a0_to_h1i3 + 3 r6a0_to_h1i3 + 3 r6a1_to_h1i3 + 3 r6a2_to_h1i3 + 3 r6a3_to_h1i3 + 3 r7a0_to_h1i3 + 3 r7a1_to_h1i3 + 3 r7a2_to_h1i3 - 16 h1i3_mem = 0
	h1i3_hdd_use: 4 r1a0_to_h1i3 + 4 r1a1_to_h1i3 + 4 r1a2_to_h1i3 + 5 r2a0_to_h1i3 + 17 r3a0_to_h1i3 + 4 r5a0_to_h1i3 + 5 r6a0_to_h1i3 + 5 r6a1_to_h1i3 + 5 r6a2_to_h1i3 + 5 r6a3_to_h1i3 + 17 r7a0_to_h1i3 + 17 r7a1_to_h1i3 + 17 r7a2_to_h1i3 - 150 h1i3_hdd = 0
	h1i4_mem_use: 2 r1a0_to_h1i4 + 2 r1a1_to_h1i4 + 2 r1a2_to_h1i4 + 3 r2a0_to_h1i4 + 3 r3a0_to_h1i4 + 2 r5a0_to_h1i4 + 3 r6a0_to_h1i4 + 3 r6a1_to_h1i4 + 3 r6a2_to_h1i4 + 3 r6a3_to_h1i4 + 3 r7a0_to_h1i4 + 3 r7a1_to_h1i4 + 3 r7a2_to_h1i4 - 16 h1i4_mem = 0
	h1i4_hdd_use: 4 r1a0_to_h1i4 + 4 r1a1_to_h1i4 + 4 r1a2_to_h1i4 + 5 r2a0_to_h1i4 + 17 r3a0_to_h1i4 + 4 r5a0_to_h1i4 + 5 r6a0_to_h1i4 + 5 r6a1_to_h1i4 + 5 r6a2_to_h1i4 + 5 r6a3_to_h1i4 + 17 r7a0_to_h1i4 + 17 r7a1_to_h1i4 + 17 r7a2_to_h1i4 - 150 h1i4_hdd = 0
	h1i5_mem_use: 2 r1a0_to_h1i5 + 2 r1a1_to_h1i5 + 2 r1a2_to_h1i5 + 3 r2a0_to_h1i5 + 3 r3a0_to_h1i5 + 2 r5a0_to_h1i5 + 3 r6a0_to_h1i5 + 3 r6a1_to_h1i5 + 3 r6a2_to_h1i5 + 3 r6a3_to_h1i5 + 3 r7a0_to_h1i5 + 3 r7a1_to_h1i5 + 3 r7a2_to_h1i5 - 16 h1i5_mem = 0
	h1i5_hdd_use: 4 r1a0_to_h1i5 + 4 r1a1_to_h1i5 + 4 r1a2_to_h1i5 + 5 r2a0_to_h1i5 + 17 r3a0_to_h1i5 + 4 r5a0_to_h1i5 + 5 r6a0_to_h1i5 + 5 r6a1_to_h1i5 + 5 r6a2_to_h1i5 + 5 r6a3_to_h1i5 + 17 r7a0_to_h1i5 + 17 r7a1_to_h1i5 + 17 r7a2_to_h1i5 - 150 h1i5_hdd = 0
	h1i6_mem_use: 2 r1a0_to_h1i6 + 2 r1a1_to_h1i6 + 2 r1a2_to_h1i6 + 3 r2a0_to_h1i6 + 3 r3a0_to_h1i6 + 2 r5a0_to_h1i6 + 3 r6a0_to_h1i6 + 3 r6a1_to_h1i6 + 3 r6a2_to_h1i6 + 3 r6a3_to_h1i6 + 3 r7a0_to_h1i6 + 3 r7a1_to_h1i6 + 3 r7a2_to_h1i6 - 16 h1i6_mem = 0
	h1i6_hdd_use: 4 r1a0_to_h1i6 + 4 r1a1_to_h1i6 + 4 r1a2_to_h1i6 + 5 r2a0_to_h1i6 + 17 r3a0_to_h1i6 + 4 r5a0_to_h1i6 + 5 r6a0_to_h1i6 + 5 r6a1_to_h1i6 + 5 r6a2_to_h1i6 + 5 r6a3_to_h1i6 + 17 r7a0_to_h1i6 + 17 r7a1_to_h1i6 + 17 r7a2_to_h1i6 - 150 h1i6_hdd = 0
	h1i7_mem_use: 2 r1a0_to_h1i7 + 2 r1a1_to_h1i7 + 2 r1a2_to_h1i7 + 3 r2a0_to_h1i7 + 3 r3a0_to_h1i7 + 2 r5a0_to_h1i7 + 3 r6a0_to_h1i7 + 3 r6a1_to_h1i7 + 3 r6a2_to_h1i7 + 3 r6a3_to_h1i7 + 3 r7a0_to_h1i7 + 3 r7a1_to_h1i7 + 3 r7a2_to_h1i7 - 16 h1i7_mem = 0
	h1i7_hdd_use: 4 r1a0_to_h1i7 + 4 r1a1_to_h1i7 + 4 r1a2_to_h1i7 + 5 r2a0_to_h1i7 + 17 r3a0_to_h1i7 + 4 r5a0_to_h1i7 + 5 r6a0_to_h1i7 + 5 r6a1_to_h1i7 + 5 r6a2_to_h1i7 + 5 r6a3_to_h1i7 + 17 r7a0_to_h1i7 + 17 r7a1_to_h1i7 + 17 r7a2_to_h1i7 - 150 h1i7_hdd = 0
	h1i8_mem_use: 2 r1a0_to_h1i8 + 2 r1a1_to_h1i8 + 2 r1a2_to_h1i8 + 3 r2a0_to_h1i8 + 3 r3a0_to_h1i8 + 2 r5a0_to_h1i8 + 3 r6a0_to_h1i8 + 3 r6a1_to_h1i8 + 3 r6a2_to_h1i8 + 3 r6a3_to_h1i8 + 3 r7a0_to_h1i8 + 3 r7a1_to_h1i8 + 3 r7a2_to_h1i8 - 16 h1i8_mem = 0
	h1i8_hdd_use: 4 r1a0_to_h1i8 + 4 r1a1_to_h1i8 + 4 r1a2_to_h1i8 + 5 r2a0_to_h1i8 + 17 r3a0_to_h1i8 + 4 r5a0_to_h1i8 + 5 r6a0_to_h1i8 + 5 r6a1_to_h1i8 + 5 r6a2_to_h1i8 + 5 r6a3_to_h1i8 + 17 r7a0_to_h1i8 + 17 r7a1_to_h1i8 + 17 r7a2_to_h1i8 - 150 h1i8_hdd = 0
	h1i9_mem_use: 2 r1a0_to_h1i9 + 2 r1a1_to_h1i9 + 2 r1a2_to_h1i9 + 3 r2a0_to_h1i9 + 3 r3a0_to_h1i9 + 2 r5a0_to_h1i9 + 3 r6a0_to_h1i9 + 3 r6a1_to_h1i9 + 3 r6a2_to_h1i9 + 3 r6a3_to_h1i9 + 3 r7a0_to_h1i9 + 3 r7a1_to_h1i9 + 3 r7a2_to_h1i9 - 16 h1i9_mem = 0
	h1i9_hdd_use: 4 r1a0_to_h1i9 + 4 r1a1_to_h1i9 + 4 r1a2_to_h1i9 + 5 r2a0_to_h1i9 + 17 r3a0_to_h1i9 + 4 r5a0_to_h1i9 + 5 r6a0_to_h1i9 + 5 r6a1_to_h1i9 + 5 r6a2_to_h1i9 + 5 r6a3_to_h1i9 + 17 r7a0_to_h1i9 + 17 r7a1_to_h1i9 + 17 r7a2_to_h1i9 - 150 h1i9_hdd = 0
	h2i0_mem_use: 2 r1a0_to_h2i0 + 2 r1a1_to_h2i0 + 2 r1a2_to_h2i0 + 3 r2a0_to_h2i0 + 3 r3a0_to_h2i0 + 2 r5a0_to_h2i0 + 3 r6a0_to_h2i0 + 3 r6a1_to_h2i0 + 3 r6a2_to_h2i0 + 3 r6a3_to_h2i0 + 3 r7a0_to_h2i0 + 3 r7a1_to_h2i0 + 3 r7a2_to_h2i0 - 16 h2i0_mem = 0
	h2i0_hdd_use: 4 r1a0_to_h2i0 + 4 r1a1_to_h2i0 + 4 r1a2_to_h2i0 + 5 r2a0_to_h2i0 + 17 r3a0_to_h2i0 + 4 r5a0_to_h2i0 + 5 r6a0_to_h2i0 + 5 r6a1_to_h2i0 + 5 r6a2_to_h2i0 + 5 r6a3_to_h2i0 + 17 r7a0_to_h2i0 + 17 r7a1_to_h2i0 + 17 r7a2_to_h2i0 - 75 h2i0_hdd = 0
	h2i1_mem_use: 2 r1a0_to_h2i1 + 2 r1a1_to_h2i1 + 2 r1a2_to_h2i1 + 3 r2a0_to_h2i1 + 3 r3a0_to_h2i1 + 2 r5a0_to_h2i1 + 3 r6a0_to_h2i1 + 3 r6a1_to_h2i1 + 3 r6a2_to_h2i1 + 3 r6a3_to_h2i1 + 3 r7a0_to_h2i1 + 3 r7a1_to_h2i1 + 3 r7a2_to_h2i1 - 16 h2i1_mem = 0
	h2i1_hdd_use: 4 r1a0_to_h2i1 + 4 r1a1_to_h2i1 + 4 r1a2_to_h2i1 + 5 r2a0_to_h2i1 + 17 r3a0_to_h2i1 + 4 r5a0_to_h2i1 + 5 r6a0_to_h2i1 + 5 r6a1_to_h2i1 + 5 r6a2_to_h2i1 + 5 r6a3_to_h2i1 + 17 r7a0_to_h2i1 + 17 r7a1_to_h2i1 + 17 r7a2_to_h2i1 - 75 h2i1_hdd = 0
	h2i2_mem_use: 2 r1a0_to_h2i2 + 2 r1a1_to_h2i2 + 2 r1a2_to_h2i2 + 3 r2a0_to_h2i2 + 3 r3a0_to_h2i2 + 2 r5a0_to_h2i2 + 3 r6a0_to_h2i2 + 3 r6a1_to_h2i2 + 3 r6a2_to_h2i2 + 3 r6a3_to_h2i2 + 3 r7a0_to_h2i2 + 3 r7a1_to_h2i2 + 3 r7a2_to_h2i2 - 16 h2i2_mem = 0
	h2i2_hdd_use: 4 r1a0_to_h2i2 + 4 r1a1_to_h2i2 + 4 r1a2_to_h2i2 + 5 r2a0_to_h2i2 + 17 r3a0_to_h2i2 + 4 r5a0_to_h2i2 + 5 r6a0_to_h2i2 + 5 r6a1_to_h2i2 + 5 r6a2_to_h2i2 + 5 r6a3_to_h2i2 + 17 r7a0_to_h2i2 + 17 r7a1_to_h2i2 + 17 r7a2_to_h2i2 - 75 h2i2_hdd = 0
	h2i3_mem_use: 2 r1a0_to_h2i3 + 2 r1a1_to_h2i3 + 2 r1a2_to_h2i3 + 3 r2a0_to_h2i3 + 3 r3a0_to_h2i3 + 2 r5a0_to_h2i3 + 3 r6a0_to_h2i3 + 3 r6a1_to_h2i3 + 3 r6a2_to_h2i3 + 3 r6a3_to_h2i3 + 3 r7a0_to_h2i3 + 3 r7a1_to_h2i3 + 3 r7a2_to_h2i3 - 16 h2i3_mem = 0
	h2i3_hdd_use: 4 r1a0_to_h2i3 + 4 r1a1_to_h2i3 + 4 r1a2_to_h2i3 + 5 r2a0_to_h2i3 + 17 r3a0_to_h2i3 + 4 r5a0_to_h2i3 + 5 r6a0_to_h2i3 + 5 r6a1_to_h2i3 + 5 r6a2_to_h2i3 + 5 r6a3_to_h2i3 + 17 r7a0_to_h2i3 + 17 r7a1_to_h2i3 + 17 r7a2_to_h2i3 - 75 h2i3_hdd = 0
	h2i4_mem_use: 2 r1a0_to_h2i4 + 2 r1a1_to_h2i4 + 2 r1a2_to_h2i4 + 3 r2a0_to_h2i4 + 3 r3a0_to_h2i4 + 2 r5a0_to_h2i4 + 3 r6a0_to_h2i4 + 3 r6a1_to_h2i4 + 3 r6a2_to_h2i4 + 3 r6a3_to_h2i4 + 3 r7a0_to_h2i4 + 3 r7a1_to_h2i4 + 3 r7a2_to_h2i4 - 16 h2i4_mem = 0
	h2i4_hdd_use: 4 r1a0_to_h2i4 + 4 r1a1_to_h2i4 + 4 r1a2_to_h2i4 + 5 r2a0_to_h2i4 + 17 r3a0_to_h2i4 + 4 r5a0_to_h2i4 + 5 r6a0_to_h2i4 + 5 r6a1_to_h2i4 + 5 r6a2_to_h2i4 + 5 r6a3_to_h2i4 + 17 r7a0_to_h2i4 + 17 r7a1_to_h2i4 + 17 r7a2_to_h2i4 - 75 h2i4_hdd = 0
	h2i5_mem_use: 2 r1a0_to_h2i5 + 2 r1a1_to_h2i5 + 2 r1a2_to_h2i5 + 3 r2a0_to_h2i5 + 3 r3a0_to_h2i5 + 2 r5a0_to_h2i5 + 3 r6a0_to_h2i5 + 3 r6a1_to_h2i5 + 3 r6a2_to_h2i5 + 3 r6a3_to_h2i5 + 3 r7a0_to_h2i5 + 3 r7a1_to_h2i5 + 3 r7a2_to_h2i5 - 16 h2i5_mem = 0
	h2i5_hdd_use: 4 r1a0_to_h2i5 + 4 r1a1_to_h2i5 + 4 r1a2_to_h2i5 + 5 r2a0_to_h2i5 + 17 r3a0_to_h2i5 + 4 r5a0_to_h2i5 + 5 r6a0_to_h2i5 + 5 r6a1_to_h2i5 + 5 r6a2_to_h2i5 + 5 r6a3_to_h2i5 + 17 r7a0_to_h2i5 + 17 r7a1_to_h2i5 + 17 r7a2_to_h2i5 - 75 h2i5_hdd = 0
	h2i6_mem_use: 2 r1a0_to_h2i6 + 2 r1a1_to_h2i6 + 2 r1a2_to_h2i6 + 3 r2a0_to_h2i6 + 3 r3a0_to_h2i6 + 2 r5a0_to_h2i6 + 3 r6a0_to_h2i6 + 3 r6a1_to_h2i6 + 3 r6a2_to_h2i6 + 3 r6a3_to_h2i6 + 3 r7a0_to_h2i6 + 3 r7a1_to_h2i6 + 3 r7a2_to_h2i6 - 16 h2i6_mem = 0
	h2i6_hdd_use: 4 r1a0_to_h2i6 + 4 r1a1_to_h2i6 + 4 r1a2_to_h2i6 + 5 r2a0_to_h2i6 + 17 r3a0_to_h2i6 + 4 r5a0_to_h2i6 + 5 r6a0_to_h2i6 + 5 r6a1_to_h2i6 + 5 r6a2_to_h2i6 + 5 r6a3_to_h2i6 + 17 r7a0_to_h2i6 + 17 r7a1_to_h2i6 + 17 r7a2_to_h2i6 - 75 h2i6_hdd = 0
	h2i7_mem_use: 2 r1a0_to_h2i7 + 2 r1a1_to_h2i7 + 2 r1a2_to_h2i7 + 3 r2a0_to_h2i7 + 3 r3a0_to_h2i7 + 2 r5a0_to_h2i7 + 3 r6a0_to_h2i7 + 3 r6a1_to_h2i7 + 3 r6a2_to_h2i7 + 3 r6a3_to_h2i7 + 3 r7a0_to_h2i7 + 3 r7a1_to_h2i7 + 3 r7a2_to_h2i7 - 16 h2i7_mem = 0
	h2i7_hdd_use: 4 r1a0_to_h2i7 + 4 r1a1_to_h2i7 + 4 r1a2_to_h2i7 + 5 r2a0_to_h2i7 + 17 r3a0_to_h2i7 + 4 r5a0_to_h2i7 + 5 r6a0_to_h2i7 + 5 r6a1_to_h2i7 + 5 r6a2_to_h2i7 + 5 r6a3_to_h2i7 + 17 r7a0_to_h2i7 + 17 r7a1_to_h2i7 + 17 r7a2_to_h2i7 - 75 h2i7_hdd = 0
	h2i8_mem_use: 2 r1a0_to_h2i8 + 2 r1a1_to_h2i8 + 2 r1a2_to_h2i8 + 3 r2a0_to_h2i8 + 3 r3a0_to_h2i8 + 2 r5a0_to_h2i8 + 3 r6a0_to_h2i8 + 3 r6a1_to_h2i8 + 3 r6a2_to_h2i8 + 3 r6a3_to_h2i8 + 3 r7a0_to_h2i8 + 3 r7a1_to_h2i8 + 3 r7a2_to_h2i8 - 16 h2i8_mem = 0
	h2i8_hdd_use: 4 r1a0_to_h2i8 + 4 r1a1_to_h2i8 + 4 r1a2_to_h2i8 + 5 r2a0_to_h2i8 + 17 r3a0_to_h2i8 + 4 r5a0_to_h2i8 + 5 r6a0_to_h2i8 + 5 r6a1_to_h2i8 + 5 r6a2_to_h2i8 + 5 r6a3_to_h2i8 + 17 r7a0_to_h2i8 + 17 r7a1_to_h2i8 + 17 r7a2_to_h2i8 - 75 h2i8_hdd = 0
	h2i9_mem_use: 2 r1a0_to_h2i9 + 2 r1a1_to_h2i9 + 2 r1a2_to_h2i9 + 3 r2a0_to_h2i9 + 3 r3a0_to_h2i9 + 2 r5a0_to_h2i9 + 3 r6a0_to_h2i9 + 3 r6a1_to_h2i9 + 3 r6a2_to_h2i9 + 3 r6a3_to_h2i9 + 3 r7a0_to_h2i9 + 3 r7a1_to_h2i9 + 3 r7a2_to_h2i9 - 16 h2i9_mem = 0
	h2i9_hdd_use: 4 r1a0_to_h2i9 + 4 r1a1_to_h2i9 + 4 r1a2_to_h2i9 + 5 r2a0_to_h2i9 + 17 r3a0_to_h2i9 + 4 r5a0_to_h2i9 + 5 r6a0_to_h2i9 + 5 r6a1_to_h2i9 + 5 r6a2_to_h2i9 + 5 r6a3_to_h2i9 + 17 r7a0_to_h2i9 + 17 r7a1_to_h2i9 + 17 r7a2_to_h2i9 - 75 h2i9_hdd = 0
	h3i0_mem_use: 2 r1a0_to_h3i0 + 2 r1a1_to_h3i0 + 2 r1a2_to_h3i0 + 3 r2a0_to_h3i0 + 3 r3a0_to_h3i0 + 2 r5a0_to_h3i0 + 3 r6a0_to_h3i0 + 3 r6a1_to_h3i0 + 3 r6a2_to_h3i0 + 3 r6a3_to_h3i0 + 3 r7a0_to_h3i0 + 3 r7a1_to_h3i0 + 3 r7a2_to_h3i0 - 32 h3i0_mem = 0
	h3i0_hdd_use: 4 r1a0_to_h3i0 + 4 r1a1_to_h3i0 + 4 r1a2_to_h3i0 + 5 r2a0_to_h3i0 + 17 r3a0_to_h3i0 + 4 r5a0_to_h3i0 + 5 r6a0_to_h3i0 + 5 r6a1_to_h3i0 + 5 r6a2_to_h3i0 + 5 r6a3_to_h3i0 + 17 r7a0_to_h3i0 + 17 r7a1_to_h3i0 + 17 r7a2_to_h3i0 - 150 h3i0_hdd = 0
	h3i1_mem_use: 2 r1a0_to_h3i1 + 2 r1a1_to_h3i1 + 2 r1a2_to_h3i1 + 3 r2a0_to_h3i1 + 3 r3a0_to_h3i1 + 2 r5a0_to_h3i1 + 3 r6a0_to_h3i1 + 3 r6a1_to_h3i1 + 3 r6a2_to_h3i1 + 3 r6a3_to_h3i1 + 3 r7a0_to_h3i1 + 3 r7a1_to_h3i1 + 3 r7a2_to_h3i1 - 32 h3i1_mem = 0
	h3i1_hdd_use: 4 r1a0_to_h3i1 + 4 r1a1_to_h3i1 + 4 r1a2_to_h3i1 + 5 r2a0_to_h3i1 + 17 r3a0_to_h3i1 + 4 r5a0_to_h3i1 + 5 r6a0_to_h3i1 + 5 r6a1_to_h3i1 + 5 r6a2_to_h3i1 + 5 r6a3_to_h3i1 + 17 r7a0_to_h3i1 + 17 r7a1_to_h3i1 + 17 r7a2_to_h3i1 - 150 h3i1_hdd = 0
	h3i2_mem_use: 2 r1a0_to_h3i2 + 2 r1a1_to_h3i2 + 2 r1a2_to_h3i2 + 3 r2a0_to_h3i2 + 3 r3a0_to_h3i2 + 2 r5a0_to_h3i2 + 3 r6a0_to_h3i2 + 3 r6a1_to_h3i2 + 3 r6a2_to_h3i2 + 3 r6a3_to_h3i2 + 3 r7a0_to_h3i2 + 3 r7a1_to_h3i2 + 3 r7a2_to_h3i2 - 32 h3i2_mem = 0
	h3i2_hdd_use: 4 r1a0_to_h3i2 + 4 r1a1_to_h3i2 + 4 r1a2_to_h3i2 + 5 r2a0_to_h3i2 + 17 r3a0_to_h3i2 + 4 r5a0_to_h3i2 + 5 r6a0_to_h3i2 + 5 r6a1_to_h3i2 + 5 r6a2_to_h3i2 + 5 r6a3_to_h3i2 + 17 r7a0_to_h3i2 + 17 r7a1_to_h3i2 + 17 r7a2_to_h3i2 - 150 h3i2_hdd = 0
	h3i3_mem_use: 2 r1a0_to_h3i3 + 2 r1a1_to_h3i3 + 2 r1a2_to_h3i3 + 3 r2a0_to_h3i3 + 3 r3a0_to_h3i3 + 2 r5a0_to_h3i3 + 3 r6a0_to_h3i3 + 3 r6a1_to_h3i3 + 3 r6a2_to_h3i3 + 3 r6a3_to_h3i3 + 3 r7a0_to_h3i3 + 3 r7a1_to_h3i3 + 3 r7a2_to_h3i3 - 32 h3i3_mem = 0
	h3i3_hdd_use: 4 r1a0_to_h3i3 + 4 r1a1_to_h3i3 + 4 r1a2_to_h3i3 + 5 r2a0_to_h3i3 + 17 r3a0_to_h3i3 + 4 r5a0_to_h3i3 + 5 r6a0_to_h3i3 + 5 r6a1_to_h3i3 + 5 r6a2_to_h3i3 + 5 r6a3_to_h3i3 + 17 r7a0_to_h3i3 + 17 r7a1_to_h3i3 + 17 r7a2_to_h3i3 - 150 h3i3_hdd = 0
	h3i4_mem_use: 2 r1a0_to_h3i4 + 2 r1a1_to_h3i4 + 2 r1a2_to_h3i4 + 3 r2a0_to_h3i4 + 3 r3a0_to_h3i4 + 2 r5a0_to_h3i4 + 3 r6a0_to_h3i4 + 3 r6a1_to_h3i4 + 3 r6a2_to_h3i4 + 3 r6a3_to_h3i4 + 3 r7a0_to_h3i4 + 3 r7a1_to_h3i4 + 3 r7a2_to_h3i4 - 32 h3i4_mem = 0
	h3i4_hdd_use: 4 r1a0_to_h3i4 + 4 r1a1_to_h3i4 + 4 r1a2_to_h3i4 + 5 r2a0_to_h3i4 + 17 r3a0_to_h3i4 + 4 r5a0_to_h3i4 + 5 r6a0_to_h3i4 + 5 r6a1_to_h3i4 + 5 r6a2_to_h3i4 + 5 r6a3_to_h3i4 + 17 r7a0_to_h3i4 + 17 r7a1_to_h3i4 + 17 r7a2_to_h3i4 - 150 h3i4_hdd = 0
	h3i5_mem_use: 2 r1a0_to_h3i5 + 2 r1a1_to_h3i5 + 2 r1a2_to_h3i5 + 3 r2a0_to_h3i5 + 3 r3a0_to_h3i5 + 2 r5a0_to_h3i5 + 3 r6a0_to_h3i5 + 3 r6a1_to_h3i5 + 3 r6a2_to_h3i5 + 3 r6a3_to_h3i5 + 3 r7a0_to_h3i5 + 3 r7a1_to_h3i5 + 3 r7a2_to_h3i5 - 32 h3i5_mem = 0
	h3i5_hdd_use: 4 r1a0_to_h3i5 + 4 r1a1_to_h3i5 + 4 r1a2_to_h3i5 + 5 r2a0_to_h3i5 + 17 r3a0_to_h3i5 + 4 r5a0_to_h3i5 + 5 r6a0_to_h3i5 + 5 r6a1_to_h3i5 + 5 r6a2_to_h3i5 + 5 r6a3_to_h3i5 + 17 r7a0_to_h3i5 + 17 r7a1_to_h3i5 + 17 r7a2_to_h3i5 - 150 h3i5_hdd = 0
	h3i6_mem_use: 2 r1a0_to_h3i6 + 2 r1a1_to_h3i6 + 2 r1a2_to_h3i6 + 3 r2a0_to_h3i6 + 3 r3a0_to_h3i6 + 2 r5a0_to_h3i6 + 3 r6a0_to_h3i6 + 3 r6a1_to_h3i6 + 3 r6a2_to_h3i6 + 3 r6a3_to_h3i6 + 3 r7a0_to_h3i6 + 3 r7a1_to_h3i6 + 3 r7a2_to_h3i6 - 32 h3i6_mem = 0
	h3i6_hdd_use: 4 r1a0_to_h3i6 + 4 r1a1_to_h3i6 + 4 r1a2_to_h3i6 + 5 r2a0_to_h3i6 + 17 r3a0_to_h3i6 + 4 r5a0_to_h3i6 + 5 r6a0_to_h3i6 + 5 r6a1_to_h3i6 + 5 r6a2_to_h3i6 + 5 r6a3_to_h3i6 + 17 r7a0_to_h3i6 + 17 r7a1_to_h3i6 + 17 r7a2_to_h3i6 - 150 h3i6_hdd = 0
	h3i7_mem_use: 2 r1a0_to_h3i7 + 2 r1a1_to_h3i7 + 2 r1a2_to_h3i7 + 3 r2a0_to_h3i7 + 3 r3a0_to_h3i7 + 2 r5a0_to_h3i7 + 3 r6a0_to_h3i7 + 3 r6a1_to_h3i7 + 3 r6a2_to_h3i7 + 3 r6a3_to_h3i7 + 3 r7a0_to_h3i7 + 3 r7a1_to_h3i7 + 3 r7a2_to_h3i7 - 32 h3i7_mem = 0
	h3i7_hdd_use: 4 r1a0_to_h3i7 + 4 r1a1_to_h3i7 + 4 r1a2_to_h3i7 + 5 r2a0_to_h3i7 + 17 r3a0_to_h3i7 + 4 r5a0_to_h3i7 + 5 r6a0_to_h3i7 + 5 r6a1_to_h3i7 + 5 r6a2_to_h3i7 + 5 r6a3_to_h3i7 + 17 r7a0_to_h3i7 + 17 r7a1_to_h3i7 + 17 r7a2_to_h3i7 - 150 h3i7_hdd = 0
	h3i8_mem_use: 2 r1a0_to_h3i8 + 2 r1a1_to_h3i8 + 2 r1a2_to_h3i8 + 3 r2a0_to_h3i8 + 3 r3a0_to_h3i8 + 2 r5a0_to_h3i8 + 3 r6a0_to_h3i8 + 3 r6a1_to_h3i8 + 3 r6a2_to_h3i8 + 3 r6a3_to_h3i8 + 3 r7a0_to_h3i8 + 3 r7a1_to_h3i8 + 3 r7a2_to_h3i8 - 32 h3i8_mem = 0
	h3i8_hdd_use: 4 r1a0_to_h3i8 + 4 r1a1_to_h3i8 + 4 r1a2_to_h3i8 + 5 r2a0_to_h3i8 + 17 r3a0_to_h3i8 + 4 r5a0_to_h3i8 + 5 r6a0_to_h3i8 + 5 r6a1_to_h3i8 + 5 r6a2_to_h3i8 + 5 r6a3_to_h3i8 + 17 r7a0_to_h3i8 + 17 r7a1_to_h3i8 + 17 r7a2_to_h3i8 - 150 h3i8_hdd = 0
	h3i9_mem_use: 2 r1a0_to_h3i9 + 2 r1a1_to_h3i9 + 2 r1a2_to_h3i9 + 3 r2a0_to_h3i9 + 3 r3a0_to_h3i9 + 2 r5a0_to_h3i9 + 3 r6a0_to_h3i9 + 3 r6a1_to_h3i9 + 3 r6a2_to_h3i9 + 3 r6a3_to_h3i9 + 3 r7a0_to_h3i9 + 3 r7a1_to_h3i9 + 3 r7a2_to_h3i9 - 32 h3i9_mem = 0
	h3i9_hdd_use: 4 r1a0_to_h3i9 + 4 r1a1_to_h3i9 + 4 r1a2_to_h3i9 + 5 r2a0_to_h3i9 + 17 r3a0_to_h3i9 + 4 r5a0_to_h3i9 + 5 r6a0_to_h3i9 + 5 r6a1_to_h3i9 + 5 r6a2_to_h3i9 + 5 r6a3_to_h3i9 + 17 r7a0_to_h3i9 + 17 r7a1_to_h3i9 + 17 r7a2_to_h3i9 - 150 h3i9_hdd = 0
	h4i0_mem_use: 4 r0a0_to_h4i0 + 4 r0a1_to_h4i0 + 4 r0a2_to_h4i0 + 4 r0a3_to_h4i0 + 2 r1a0_to_h4i0 + 2 r1a1_to_h4i0 + 2 r1a2_to_h4i0 + 3 r2a0_to_h4i0 + 3 r3a0_to_h4i0 + 4 r4a0_to_h4i0 + 4 r4a1_to_h4i0 + 4 r4a2_to_h4i0 + 4 r4a3_to_h4i0 + 2 r5a0_to_h4i0 + 3 r6a0_to_h4i0 + 3 r6a1_to_h4i0 + 3 r6a2_to_h4i0 + 3 r6a3_to_h4i0 + 3 r7a0_to_h4i0 + 3 r7a1_to_h4i0 + 3 r7a2_to_h4i0 - 4 h4i0_mem = 0
	h4i0_hdd_use: 29 r0a0_to_h4i0 + 29 r0a1_to_h4i0 + 29 r0a2_to_h4i0 + 29 r0a3_to_h4i0 + 4 r1a0_to_h4i0 + 4 r1a1_to_h4i0 + 4 r1a2_to_h4i0 + 5 r2a0_to_h4i0 + 17 r3a0_to_h4i0 + 29 r4a0_to_h4i0 + 29 r4a1_to_h4i0 + 29 r4a2_to_h4i0 + 29 r4a3_to_h4i0 + 4 r5a0_to_h4i0 + 5 r6a0_to_h4i0 + 5 r6a1_to_h4i0 + 5 r6a2_to_h4i0 + 5 r6a3_to_h4i0 + 17 r7a0_to_h4i0 + 17 r7a1_to_h4i0 + 17 r7a2_to_h4i0 - 50 h4i0_hdd = 0
	h4i1_mem_use: 4 r0a0_to_h4i1 + 4 r0a1_to_h4i1 + 4 r0a2_to_h4i1 + 4 r0a3_to_h4i1 + 2 r1a0_to_h4i1 + 2 r1a1_to_h4i1 + 2 r1a2_to_h4i1 + 3 r2a0_to_h4i1 + 3 r3a0_to_h4i1 + 4 r4a0_to_h4i1 + 4 r4a1_to_h4i1 + 4 r4a2_to_h4i1 + 4 r4a3_to_h4i1 + 2 r5a0_to_h4i1 + 3 r6a0_to_h4i1 + 3 r6a1_to_h4i1 + 3 r6a2_to_h4i1 + 3 r6a3_to_h4i1 + 3 r7a0_to_h4i1 + 3 r7a1_to_h4i1 + 3 r7a2_to_h4i1 - 4 h4i1_mem = 0
	h4i1_hdd_use: 29 r0a0_to_h4i1 + 29 r0a1_to_h4i1 + 29 r0a2_to_h4i1 + 29 r0a3_to_h4i1 + 4 r1a0_to_h4i1 + 4 r1a1_to_h4i1 + 4 r1a2_to_h4i1 + 5 r2a0_to_h4i1 + 17 r3a0_to_h4i1 + 29 r4a0_to_h4i1 + 29 r4a1_to_h4i1 + 29 r4a2_to_h4i1 + 29 r4a3_to_h4i1 + 4 r5a0_to_h4i1 + 5 r6a0_to_h4i1 + 5 r6a1_to_h4i1 + 5 r6a2_to_h4i1 + 5 r6a3_to_h4i1 + 17 r7a0_to_h4i1 + 17 r7a1_to_h4i1 + 17 r7a2_to_h4i1 - 50 h4i1_hdd = 0
	h4i2_mem_use: 4 r0a0_to_h4i2 + 4 r0a1_to_h4i2 + 4 r0a2_to_h4i2 + 4 r0a3_to_h4i2 + 2 r1a0_to_h4i2 + 2 r1a1_to_h4i2 + 2 r1a2_to_h4i2 + 3 r2a0_to_h4i2 + 3 r3a0_to_h4i2 + 4 r4a0_to_h4i2 + 4 r4a1_to_h4i2 + 4 r4a2_to_h4i2 + 4 r4a3_to_h4i2 + 2 r5a0_to_h4i2 + 3 r6a0_to_h4i2 + 3 r6a1_to_h4i2 + 3 r6a2_to_h4i2 + 3 r6a3_to_h4i2 + 3 r7a0_to_h4i2 + 3 r7a1_to_h4i2 + 3 r7a2_to_h4i2 - 4 h4i2_mem = 0
	h4i2_hdd_use: 29 r0a0_to_h4i2 + 29 r0a1_to_h4i2 + 29 r0a2_to_h4i2 + 29 r0a3_to_h4i2 + 4 r1a0_to_h4i2 + 4 r1a1_to_h4i2 + 4 r1a2_to_h4i2 + 5 r2a0_to_h4i2 + 17 r3a0_to_h4i2 + 29 r4a0_to_h4i2 + 29 r4a1_to_h4i2 + 29 r4a2_to_h4i2 + 29 r4a3_to_h4i2 + 4 r5a0_to_h4i2 + 5 r6a0_to_h4i2 + 5 r6a1_to_h4i2 + 5 r6a2_to_h4i2 + 5 r6a3_to_h4i2 + 17 r7a0_to_h4i2 + 17 r7a1_to_h4i2 + 17 r7a2_to_h4i2 - 50 h4i2_hdd = 0
	h4i3_mem_use: 4 r0a0_to_h4i3 + 4 r0a1_to_h4i3 + 4 r0a2_to_h4i3 + 4 r0a3_to_h4i3 + 2 r1a0_to_h4i3 + 2 r1a1_to_h4i3 + 2 r1a2_to_h4i3 + 3 r2a0_to_h4i3 + 3 r3a0_to_h4i3 + 4 r4a0_to_h4i3 + 4 r4a1_to_h4i3 + 4 r4a2_to_h4i3 + 4 r4a3_to_h4i3 + 2 r5a0_to_h4i3 + 3 r6a0_to_h4i3 + 3 r6a1_to_h4i3 + 3 r6a2_to_h4i3 + 3 r6a3_to_h4i3 + 3 r7a0_to_h4i3 + 3 r7a1_to_h4i3 + 3 r7a2_to_h4i3 - 4 h4i3_mem = 0
	h4i3_hdd_use: 29 r0a0_to_h4i3 + 29 r0a1_to_h4i3 + 29 r0a2_to_h4i3 + 29 r0a3_to_h4i3 + 4 r1a0_to_h4i3 + 4 r1a1_to_h4i3 + 4 r1a2_to_h4i3 + 5 r2a0_to_h4i3 + 17 r3a0_to_h4i3 + 29 r4a0_to_h4i3 + 29 r4a1_to_h4i3 + 29 r4a2_to_h4i3 + 29 r4a3_to_h4i3 + 4 r5a0_to_h4i3 + 5 r6a0_to_h4i3 + 5 r6a1_to_h4i3 + 5 r6a2_to_h4i3 + 5 r6a3_to_h4i3 + 17 r7a0_to_h4i3 + 17 r7a1_to_h4i3 + 17 r7a2_to_h4i3 - 50 h4i3_hdd = 0
	h4i4_mem_use: 4 r0a0_to_h4i4 + 4 r0a1_to_h4i4 + 4 r0a2_to_h4i4 + 4 r0a3_to_h4i4 + 2 r1a0_to_h4i4 + 2 r1a1_to_h4i4 + 2 r1a2_to_h4i4 + 3 r2a0_to_h4i4 + 3 r3a0_to_h4i4 + 4 r4a0_to_h4i4 + 4 r4a1_to_h4i4 + 4 r4a2_to_h4i4 + 4 r4a3_to_h4i4 + 2 r5a0_to_h4i4 + 3 r6a0_to_h4i4 + 3 r6a1_to_h4i4 + 3 r6a2_to_h4i4 + 3 r6a3_to_h4i4 + 3 r7a0_to_h4i4 + 3 r7a1_to_h4i4 + 3 r7a2_to_h4i4 - 4 h4i4_mem = 0
	h4i4_hdd_use: 29 r0a0_to_h4i4 + 29 r0a1_to_h4i4 + 29 r0a2_to_h4i4 + 29 r0a3_to_h4i4 + 4 r1a0_to_h4i4 + 4 r1a1_to_h4i4 + 4 r1a2_to_h4i4 + 5 r2a0_to_h4i4 + 17 r3a0_to_h4i4 + 29 r4a0_to_h4i4 + 29 r4a1_to_h4i4 + 29 r4a2_to_h4i4 + 29 r4a3_to_h4i4 + 4 r5a0_to_h4i4 + 5 r6a0_to_h4i4 + 5 r6a1_to_h4i4 + 5 r6a2_to_h4i4 + 5 r6a3_to_h4i4 + 17 r7a0_to_h4i4 + 17 r7a1_to_h4i4 + 17 r7a2_to_h4i4 - 50 h4i4_hdd = 0
	h4i5_mem_use: 4 r0a0_to_h4i5 + 4 r0a1_to_h4i5 + 4 r0a2_to_h4i5 + 4 r0a3_to_h4i5 + 2 r1a0_to_h4i5 + 2 r1a1_to_h4i5 + 2 r1a2_to_h4i5 + 3 r2a0_to_h4i5 + 3 r3a0_to_h4i5 + 4 r4a0_to_h4i5 + 4 r4a1_to_h4i5 + 4 r4a2_to_h4i5 + 4 r4a3_to_h4i5 + 2 r5a0_to_h4i5 + 3 r6a0_to_h4i5 + 3 r6a1_to_h4i5 + 3 r6a2_to_h4i5 + 3 r6a3_to_h4i5 + 3 r7a0_to_h4i5 + 3 r7a1_to_h4i5 + 3 r7a2_to_h4i5 - 4 h4i5_mem = 0
	h4i5_hdd_use: 29 r0a0_to_h4i5 + 29 r0a1_to_h4i5 + 29 r0a2_to_h4i5 + 29 r0a3_to_h4i5 + 4 r1a0_to_h4i5 + 4 r1a1_to_h4i5 + 4 r1a2_to_h4i5 + 5 r2a0_to_h4i5 + 17 r3a0_to_h4i5 + 29 r4a0_to_h4i5 + 29 r4a1_to_h4i5 + 29 r4a2_to_h4i5 + 29 r4a3_to_h4i5 + 4 r5a0_to_h4i5 + 5 r6a0_to_h4i5 + 5 r6a1_to_h4i5 + 5 r6a2_to_h4i5 + 5 r6a3_to_h4i5 + 17 r7a0_to_h4i5 + 17 r7a1_to_h4i5 + 17 r7a2_to_h4i5 - 50 h4i5_hdd = 0
	h4i6_mem_use: 4 r0a0_to_h4i6 + 4 r0a1_to_h4i6 + 4 r0a2_to_h4i6 + 4 r0a3_to_h4i6 + 2 r1a0_to_h4i6 + 2 r1a1_to_h4i6 + 2 r1a2_to_h4i6 + 3 r2a0_to_h4i6 + 3 r3a0_to_h4i6 + 4 r4a0_to_h4i6 + 4 r4a1_to_h4i6 + 4 r4a2_to_h4i6 + 4 r4a3_to_h4i6 + 2 r5a0_to_h4i6 + 3 r6a0_to_h4i6 + 3 r6a1_to_h4i6 + 3 r6a2_to_h4i6 + 3 r6a3_to_h4i6 + 3 r7a0_to_h4i6 + 3 r7a1_to_h4i6 + 3 r7a2_to_h4i6 - 4 h4i6_mem = 0
	h4i6_hdd_use: 29 r0a0_to_h4i6 + 29 r0a1_to_h4i6 + 29 r0a2_to_h4i6 + 29 r0a3_to_h4i6 + 4 r1a0_to_h4i6 + 4 r1a1_to_h4i6 + 4 r1a2_to_h4i6 + 5 r2a0_to_h4i6 + 17 r3a0_to_h4i6 + 29 r4a0_to_h4i6 + 29 r4a1_to_h4i6 + 29 r4a2_to_h4i6 + 29 r4a3_to_h4i6 + 4 r5a0_to_h4i6 + 5 r6a0_to_h4i6 + 5 r6a1_to_h4i6 + 5 r6a2_to_h4i6 + 5 r6a3_to_h4i6 + 17 r7a0_to_h4i6 + 17 r7a1_to_h4i6 + 17 r7a2_to_h4i6 - 50 h4i6_hdd = 0
	h4i7_mem_use: 4 r0a0_to_h4i7 + 4 r0a1_to_h4i7 + 4 r0a2_to_h4i7 + 4 r0a3_to_h4i7 + 2 r1a0_to_h4i7 + 2 r1a1_to_h4i7 + 2 r1a2_to_h4i7 + 3 r2a0_to_h4i7 + 3 r3a0_to_h4i7 + 4 r4a0_to_h4i7 + 4 r4a1_to_h4i7 + 4 r4a2_to_h4i7 + 4 r4a3_to_h4i7 + 2 r5a0_to_h4i7 + 3 r6a0_to_h4i7 + 3 r6a1_to_h4i7 + 3 r6a2_to_h4i7 + 3 r6a3_to_h4i7 + 3 r7a0_to_h4i7 + 3 r7a1_to_h4i7 + 3 r7a2_to_h4i7 - 4 h4i7_mem = 0
	h4i7_hdd_use: 29 r0a0_to_h4i7 + 29 r0a1_to_h4i7 + 29 r0a2_to_h4i7 + 29 r0a3_to_h4i7 + 4 r1a0_to_h4i7 + 4 r1a1_to_h4i7 + 4 r1a2_to_h4i7 + 5 r2a0_to_h4i7 + 17 r3a0_to_h4i7 + 29 r4a0_to_h4i7 + 29 r4a1_to_h4i7 + 29 r4a2_to_h4i7 + 29 r4a3_to_h4i7 + 4 r5a0_to_h4i7 + 5 r6a0_to_h4i7 + 5 r6a1_to_h4i7 + 5 r6a2_to_h4i7 + 5 r6a3_to_h4i7 + 17 r7a0_to_h4i7 + 17 r7a1_to_h4i7 + 17 r7a2_to_h4i7 - 50 h4i7_hdd = 0
	h4i8_mem_use: 4 r0a0_to_h4i8 + 4 r0a1_to_h4i8 + 4 r0a2_to_h4i8 + 4 r0a3_to_h4i8 + 2 r1a0_to_h4i8 + 2 r1a1_to_h4i8 + 2 r1a2_to_h4i8 + 3 r2a0_to_h4i8 + 3 r3a0_to_h4i8 + 4 r4a0_to_h4i8 + 4 r4a1_to_h4i8 + 4 r4a2_to_h4i8 + 4 r4a3_to_h4i8 + 2 r5a0_to_h4i8 + 3 r6a0_to_h4i8 + 3 r6a1_to_h4i8 + 3 r6a2_to_h4i8 + 3 r6a3_to_h4i8 + 3 r7a0_to_h4i8 + 3 r7a1_to_h4i8 + 3 r7a2_to_h4i8 - 4 h4i8_mem = 0
	h4i8_hdd_use: 29 r0a0_to_h4i8 + 29 r0a1_to_h4i8 + 29 r0a2_to_h4i8 + 29 r0a3_to_h4i8 + 4 r1a0_to_h4i8 + 4 r1a1_to_h4i8 + 4 r1a2_to_h4i8 + 5 r2a0_to_h4i8 + 17 r3a0_to_h4i8 + 29 r4a0_to_h4i8 + 29 r4a1_to_h4i8 + 29 r4a2_to_h4i8 + 29 r4a3_to_h4i8 + 4 r5a0_to_h4i8 + 5 r6a0_to_h4i8 + 5 r6a1_to_h4i8 + 5 r6a2_to_h4i8 + 5 r6a3_to_h4i8 + 17 r7a0_to_h4i8 + 17 r7a1_to_h4i8 + 17 r7a2_to_h4i8 - 50 h4i8_hdd = 0
	h4i9_mem_use: 4 r0a0_to_h4i9 + 4 r0a1_to_h4i9 + 4 r0a2_to_h4i9 + 4 r0a3_to_h4i9 + 2 r1a0_to_h4i9 + 2 r1a1_to_h4i9 + 2 r1a2_to_h4i9 + 3 r2a0_to_h4i9 + 3 r3a0_to_h4i9 + 4 r4a0_to_h4i9 + 4 r4a1_to_h4i9 + 4 r4a2_to_h4i9 + 4 r4a3_to_h4i9 + 2 r5a0_to_h4i9 + 3 r6a0_to_h4i9 + 3 r6a1_to_h4i9 + 3 r6a2_to_h4i9 + 3 r6a3_to_h4i9 + 3 r7a0_to_h4i9 + 3 r7a1_to_h4i9 + 3 r7a2_to_h4i9 - 4 h4i9_mem = 0
	h4i9_hdd_use: 29 r0a0_to_h4i9 + 29 r0a1_to_h4i9 + 29 r0a2_to_h4i9 + 29 r0a3_to_h4i9 + 4 r1a0_to_h4i9 + 4 r1a1_to_h4i9 + 4 r1a2_to_h4i9 + 5 r2a0_to_h4i9 + 17 r3a0_to_h4i9 + 29 r4a0_to_h4i9 + 29 r4a1_to_h4i9 + 29 r4a2_to_h4i9 + 29 r4a3_to_h4i9 + 4 r5a0_to_h4i9 + 5 r6a0_to_h4i9 + 5 r6a1_to_h4i9 + 5 r6a2_to_h4i9 + 5 r6a3_to_h4i9 + 17 r7a0_to_h4i9 + 17 r7a1_to_h4i9 + 17 r7a2_to_h4i9 - 50 h4i9_hdd = 0
	h5i0_mem_use: 4 r0a0_to_h5i0 + 4 r0a1_to_h5i0 + 4 r0a2_to_h5i0 + 4 r0a3_to_h5i0 + 2 r1a0_to_h5i0 + 2 r1a1_to_h5i0 + 2 r1a2_to_h5i0 + 3 r2a0_to_h5i0 + 3 r3a0_to_h5i0 + 4 r4a0_to_h5i0 + 4 r4a1_to_h5i0 + 4 r4a2_to_h5i0 + 4 r4a3_to_h5i0 + 2 r5a0_to_h5i0 + 3 r6a0_to_h5i0 + 3 r6a1_to_h5i0 + 3 r6a2_to_h5i0 + 3 r6a3_to_h5i0 + 3 r7a0_to_h5i0 + 3 r7a1_to_h5i0 + 3 r7a2_to_h5i0 - 8 h5i0_mem = 0
	h5i0_hdd_use: 29 r0a0_to_h5i0 + 29 r0a1_to_h5i0 + 29 r0a2_to_h5i0 + 29 r0a3_to_h5i0 + 4 r1a0_to_h5i0 + 4 r1a1_to_h5i0 + 4 r1a2_to_h5i0 + 5 r2a0_to_h5i0 + 17 r3a0_to_h5i0 + 29 r4a0_to_h5i0 + 29 r4a1_to_h5i0 + 29 r4a2_to_h5i0 + 29 r4a3_to_h5i0 + 4 r5a0_to_h5i0 + 5 r6a0_to_h5i0 + 5 r6a1_to_h5i0 + 5 r6a2_to_h5i0 + 5 r6a3_to_h5i0 + 17 r7a0_to_h5i0 + 17 r7a1_to_h5i0 + 17 r7a2_to_h5i0 - 100 h5i0_hdd = 0
	h5i1_mem_use: 4 r0a0_to_h5i1 + 4 r0a1_to_h5i1 + 4 r0a2_to_h5i1 + 4 r0a3_to_h5i1 + 2 r1a0_to_h5i1 + 2 r1a1_to_h5i1 + 2 r1a2_to_h5i1 + 3 r2a0_to_h5i1 + 3 r3a0_to_h5i1 + 4 r4a0_to_h5i1 + 4 r4a1_to_h5i1 + 4 r4a2_to_h5i1 + 4 r4a3_to_h5i1 + 2 r5a0_to_h5i1 + 3 r6a0_to_h5i1 + 3 r6a1_to_h5i1 + 3 r6a2_to_h5i1 + 3 r6a3_to_h5i1 + 3 r7a0_to_h5i1 + 3 r7a1_to_h5i1 + 3 r7a2_to_h5i1 - 8 h5i1_mem = 0
	h5i1_hdd_use: 29 r0a0_to_h5i1 + 29 r0a1_to_h5i1 + 29 r0a2_to_h5i1 + 29 r0a3_to_h5i1 + 4 r1a0_to_h5i1 + 4 r1a1_to_h5i1 + 4 r1a2_to_h5i1 + 5 r2a0_to_h5i1 + 17 r3a0_to_h5i1 + 29 r4a0_to_h5i1 + 29 r4a1_to_h5i1 + 29 r4a2_to_h5i1 + 29 r4a3_to_h5i1 + 4 r5a0_to_h5i1 + 5 r6a0_to_h5i1 + 5 r6a1_to_h5i1 + 5 r6a2_to_h5i1 + 5 r6a3_to_h5i1 + 17 r7a0_to_h5i1 + 17 r7a1_to_h5i1 + 17 r7a2_to_h5i1 - 100 h5i1_hdd = 0
	h5i2_mem_use: 4 r0a0_to_h5i2 + 4 r0a1_to_h5i2 + 4 r0a2_to_h5i2 + 4 r0a3_to_h5i2 + 2 r1a0_to_h5i2 + 2 r1a1_to_h5i2 + 2 r1a2_to_h5i2 + 3 r2a0_to_h5i2 + 3 r3a0_to_h5i2 + 4 r4a0_to_h5i2 + 4 r4a1_to_h5i2 + 4 r4a2_to_h5i2 + 4 r4a3_to_h5i2 + 2 r5a0_to_h5i2 + 3 r6a0_to_h5i2 + 3 r6a1_to_h5i2 + 3 r6a2_to_h5i2 + 3 r6a3_to_h5i2 + 3 r7a0_to_h5i2 + 3 r7a1_to_h5i2 + 3 r7a2_to_h5i2 - 8 h5i2_mem = 0
	h5i2_hdd_use: 29 r0a0_to_h5i2 + 29 r0a1_to_h5i2 + 29 r0a2_to_h5i2 + 29 r0a3_to_h5i2 + 4 r1a0_to_h5i2 + 4 r1a1_to_h5i2 + 4 r1a2_to_h5i2 + 5 r2a0_to_h5i2 + 17 r3a0_to_h5i2 + 29 r4a0_to_h5i2 + 29 r4a1_to_h5i2 + 29 r4a2_to_h5i2 + 29 r4a3_to_h5i2 + 4 r5a0_to_h5i2 + 5 r6a0_to_h5i2 + 5 r6a1_to_h5i2 + 5 r6a2_to_h5i2 + 5 r6a3_to_h5i2 + 17 r7a0_to_h5i2 + 17 r7a1_to_h5i2 + 17 r7a2_to_h5i2 - 100 h5i2_hdd = 0
	h5i3_mem_use: 4 r0a0_to_h5i3 + 4 r0a1_to_h5i3 + 4 r0a2_to_h5i3 + 4 r0a3_to_h5i3 + 2 r1a0_to_h5i3 + 2 r1a1_to_h5i3 + 2 r1a2_to_h5i3 + 3 r2a0_to_h5i3 + 3 r3a0_to_h5i3 + 4 r4a0_to_h5i3 + 4 r4a1_to_h5i3 + 4 r4a2_to_h5i3 + 4 r4a3_to_h5i3 + 2 r5a0_to_h5i3 + 3 r6a0_to_h5i3 + 3 r6a1_to_h5i3 + 3 r6a2_to_h5i3 + 3 r6a3_to_h5i3 + 3 r7a0_to_h5i3 + 3 r7a1_to_h5i3 + 3 r7a2_to_h5i3 - 8 h5i3_mem = 0
	h5i3_hdd_use: 29 r0a0_to_h5i3 + 29 r0a1_to_h5i3 + 29 r0a2_to_h5i3 + 29 r0a3_to_h5i3 + 4 r1a0_to_h5i3 + 4 r1a1_to_h5i3 + 4 r1a2_to_h5i3 + 5 r2a0_to_h5i3 + 17 r3a0_to_h5i3 + 29 r4a0_to_h5i3 + 29 r4a1_to_h5i3 + 29 r4a2_to_h5i3 + 29 r4a3_to_h5i3 + 4 r5a0_to_h5i3 + 5 r6a0_to_h5i3 + 5 r6a1_to_h5i3 + 5 r6a2_to_h5i3 + 5 r6a3_to_h5i3 + 17 r7a0_to_h5i3 + 17 r7a1_to_h5i3 + 17 r7a2_to_h5i3 - 100 h5i3_hdd = 0
	h5i4_mem_use: 4 r0a0_to_h5i4 + 4 r0a1_to_h5i4 + 4 r0a2_to_h5i4 + 4 r0a3_to_h5i4 + 2 r1a0_to_h5i4 + 2 r1a1_to_h5i4 + 2 r1a2_to_h5i4 + 3 r2a0_to_h5i4 + 3 r3a0_to_h5i4 + 4 r4a0_to_h5i4 + 4 r4a1_to_h5i4 + 4 r4a2_to_h5i4 + 4 r4a3_to_h5i4 + 2 r5a0_to_h5i4 + 3 r6a0_to_h5i4 + 3 r6a1_to_h5i4 + 3 r6a2_to_h5i4 + 3 r6a3_to_h5i4 + 3 r7a0_to_h5i4 + 3 r7a1_to_h5i4 + 3 r7a2_to_h5i4 - 8 h5i4_mem = 0
	h5i4_hdd_use: 29 r0a0_to_h5i4 + 29 r0a1_to_h5i4 + 29 r0a2_to_h5i4 + 29 r0a3_to_h5i4 + 4 r1a0_to_h5i4 + 4 r1a1_to_h5i4 + 4 r1a2_to_h5i4 + 5 r2a0_to_h5i4 + 17 r3a0_to_h5i4 + 29 r4a0_to_h5i4 + 29 r4a1_to_h5i4 + 29 r4a2_to_h5i4 + 29 r4a3_to_h5i4 + 4 r5a0_to_h5i4 + 5 r6a0_to_h5i4 + 5 r6a1_to_h5i4 + 5 r6a2_to_h5i4 + 5 r6a3_to_h5i4 + 17 r7a0_to_h5i4 + 17 r7a1_to_h5i4 + 17 r7a2_to_h5i4 - 100 h5i4_hdd = 0
	h5i5_mem_use: 4 r0a0_to_h5i5 + 4 r0a1_to_h5i5 + 4 r0a2_to_h5i5 + 4 r0a3_to_h5i5 + 2 r1a0_to_h5i5 + 2 r1a1_to_h5i5 + 2 r1a2_to_h5i5 + 3 r2a0_to_h5i5 + 3 r3a0_to_h5i5 + 4 r4a0_to_h5i5 + 4 r4a1_to_h5i5 + 4 r4a2_to_h5i5 + 4 r4a3_to_h5i5 + 2 r5a0_to_h5i5 + 3 r6a0_to_h5i5 + 3 r6a1_to_h5i5 + 3 r6a2_to_h5i5 + 3 r6a3_to_h5i5 + 3 r7a0_to_h5i5 + 3 r7a1_to_h5i5 + 3 r7a2_to_h5i5 - 8 h5i5_mem = 0
	h5i5_hdd_use: 29 r0a0_to_h5i5 + 29 r0a1_to_h5i5 + 29 r0a2_to_h5i5 + 29 r0a3_to_h5i5 + 4 r1a0_to_h5i5 + 4 r1a1_to_h5i5 + 4 r1a2_to_h5i5 + 5 r2a0_to_h5i5 + 17 r3a0_to_h5i5 + 29 r4a0_to_h5i5 + 29 r4a1_to_h5i5 + 29 r4a2_to_h5i5 + 29 r4a3_to_h5i5 + 4 r5a0_to_h5i5 + 5 r6a0_to_h5i5 + 5 r6a1_to_h5i5 + 5 r6a2_to_h5i5 + 5 r6a3_to_h5i5 + 17 r7a0_to_h5i5 + 17 r7a1_to_h5i5 + 17 r7a2_to_h5i5 - 100 h5i5_hdd = 0
	h5i6_mem_use: 4 r0a0_to_h5i6 + 4 r0a1_to_h5i6 + 4 r0a2_to_h5i6 + 4 r0a3_to_h5i6 + 2 r1a0_to_h5i6 + 2 r1a1_to_h5i6 + 2 r1a2_to_h5i6 + 3 r2a0_to_h5i6 + 3 r3a0_to_h5i6 + 4 r4a0_to_h5i6 + 4 r4a1_to_h5i6 + 4 r4a2_to_h5i6 + 4 r4a3_to_h5i6 + 2 r5a0_to_h5i6 + 3 r6a0_to_h5i6 + 3 r6a1_to_h5i6 + 3 r6a2_to_h5i6 + 3 r6a3_to_h5i6 + 3 r7a0_to_h5i6 + 3 r7a1_to_h5i6 + 3 r7a2_to_h5i6 - 8 h5i6_mem = 0
	h5i6_hdd_use: 29 r0a0_to_h5i6 + 29 r0a1_to_h5i6 + 29 r0a2_to_h5i6 + 29 r0a3_to_h5i6 + 4 r1a0_to_h5i6 + 4 r1a1_to_h5i6 + 4 r1a2_to_h5i6 + 5 r2a0_to_h5i6 + 17 r3a0_to_h5i6 + 29 r4a0_to_h5i6 + 29 r4a1_to_h5i6 + 29 r4a2_to_h5i6 + 29 r4a3_to_h5i6 + 4 r5a0_to_h5i6 + 5 r6a0_to_h5i6 + 5 r6a1_to_h5i6 + 5 r6a2_to_h5i6 + 5 r6a3_to_h5i6 + 17 r7a0_to_h5i6 + 17 r7a1_to_h5i6 + 17 r7a2_to_h5i6 - 100 h5i6_hdd = 0
	h5i7_mem_use: 4 r0a0_to_h5i7 + 4 r0a1_to_h5i7 + 4 r0a2_to_h5i7 + 4 r0a3_to_h5i7 + 2 r1a0_to_h5i7 + 2 r1a1_to_h5i7 + 2 r1a2_to_h5i7 + 3 r2a0_to_h5i7 + 3 r3a0_to_h5i7 + 4 r4a0_to_h5i7 + 4 r4a1_to_h5i7 + 4 r4a2_to_h5i7 + 4 r4a3_to_h5i7 + 2 r5a0_to_h5i7 + 3 r6a0_to_h5i7 + 3 r6a1_to_h5i7 + 3 r6a2_to_h5i7 + 3 r6a3_to_h5i7 + 3 r7a0_to_h5i7 + 3 r7a1_to_h5i7 + 3 r7a2_to_h5i7 - 8 h5i7_mem = 0
	h5i7_hdd_use: 29 r0a0_to_h5i7 + 29 r0a1_to_h5i7 + 29 r0a2_to_h5i7 + 29 r0a3_to_h5i7 + 4 r1a0_to_h5i7 + 4 r1a1_to_h5i7 + 4 r1a2_to_h5i7 + 5 r2a0_to_h5i7 + 17 r3a0_to_h5i7 + 29 r4a0_to_h5i7 + 29 r4a1_to_h5i7 + 29 r4a2_to_h5i7 + 29 r4a3_to_h5i7 + 4 r5a0_to_h5i7 + 5 r6a0_to_h5i7 + 5 r6a1_to_h5i7 + 5 r6a2_to_h5i7 + 5 r6a3_to_h5i7 + 17 r7a0_to_h5i7 + 17 r7a1_to_h5i7 + 17 r7a2_to_h5i7 - 100 h5i7_hdd = 0
	h5i8_mem_use: 4 r0a0_to_h5i8 + 4 r0a1_to_h5i8 + 4 r0a2_to_h5i8 + 4 r0a3_to_h5i8 + 2 r1a0_to_h5i8 + 2 r1a1_to_h5i8 + 2 r1a2_to_h5i8 + 3 r2a0_to_h5i8 + 3 r3a0_to_h5i8 + 4 r4a0_to_h5i8 + 4 r4a1_to_h5i8 + 4 r4a2_to_h5i8 + 4 r4a3_to_h5i8 + 2 r5a0_to_h5i8 + 3 r6a0_to_h5i8 + 3 r6a1_to_h5i8 + 3 r6a2_to_h5i8 + 3 r6a3_to_h5i8 + 3 r7a0_to_h5i8 + 3 r7a1_to_h5i8 + 3 r7a2_to_h5i8 - 8 h5i8_mem = 0
	h5i8_hdd_use: 29 r0a0_to_h5i8 + 29 r0a1_to_h5i8 + 29 r0a2_to_h5i8 + 29 r0a3_to_h5i8 + 4 r1a0_to_h5i8 + 4 r1a1_to_h5i8 + 4 r1a2_to_h5i8 + 5 r2a0_to_h5i8 + 17 r3a0_to_h5i8 + 29 r4a0_to_h5i8 + 29 r4a1_to_h5i8 + 29 r4a2_to_h5i8 + 29 r4a3_to_h5i8 + 4 r5a0_to_h5i8 + 5 r6a0_to_h5i8 + 5 r6a1_to_h5i8 + 5 r6a2_to_h5i8 + 5 r6a3_to_h5i8 + 17 r7a0_to_h5i8 + 17 r7a1_to_h5i8 + 17 r7a2_to_h5i8 - 100 h5i8_hdd = 0
	h5i9_mem_use: 4 r0a0_to_h5i9 + 4 r0a1_to_h5i9 + 4 r0a2_to_h5i9 + 4 r0a3_to_h5i9 + 2 r1a0_to_h5i9 + 2 r1a1_to_h5i9 + 2 r1a2_to_h5i9 + 3 r2a0_to_h5i9 + 3 r3a0_to_h5i9 + 4 r4a0_to_h5i9 + 4 r4a1_to_h5i9 + 4 r4a2_to_h5i9 + 4 r4a3_to_h5i9 + 2 r5a0_to_h5i9 + 3 r6a0_to_h5i9 + 3 r6a1_to_h5i9 + 3 r6a2_to_h5i9 + 3 r6a3_to_h5i9 + 3 r7a0_to_h5i9 + 3 r7a1_to_h5i9 + 3 r7a2_to_h5i9 - 8 h5i9_mem = 0
	h5i9_hdd_use: 29 r0a0_to_h5i9 + 29 r0a1_to_h5i9 + 29 r0a2_to_h5i9 + 29 r0a3_to_h5i9 + 4 r1a0_to_h5i9 + 4 r1a1_to_h5i9 + 4 r1a2_to_h5i9 + 5 r2a0_to_h5i9 + 17 r3a0_to_h5i9 + 29 r4a0_to_h5i9 + 29 r4a1_to_h5i9 + 29 r4a2_to_h5i9 + 29 r4a3_to_h5i9 + 4 r5a0_to_h5i9 + 5 r6a0_to_h5i9 + 5 r6a1_to_h5i9 + 5 r6a2_to_h5i9 + 5 r6a3_to_h5i9 + 17 r7a0_to_h5i9 + 17 r7a1_to_h5i9 + 17 r7a2_to_h5i9 - 100 h5i9_hdd = 0
	average_mem: h0i0_mem - 0.25 h0i0_exists + h0i1_mem - 0.25 h0i1_exists + h0i2_mem - 0.25 h0i2_exists + h0i3_mem - 0.25 h0i3_exists + h0i4_mem - 0.25 h0i4_exists + h0i5_mem - 0.25 h0i5_exists + h0i6_mem - 0.25 h0i6_exists + h0i7_mem - 0.25 h0i7_exists + h0i8_mem - 0.25 h0i8_exists + h0i9_mem - 0.25 h0i9_exists + h1i0_mem - 0.25 h1i0_exists + h1i1_mem - 0.25 h1i1_exists + h1i2_mem - 0.25 h1i2_exists + h1i3_mem - 0.25 h1i3_exists + h1i4_mem - 0.25 h1i4_exists + h1i5_mem - 0.25 h1i5_exists + h1i6_mem - 0.25 h1i6_exists + h1i7_mem - 0.25 h1i7_exists + h1i8_mem - 0.25 h1i8_exists + h1i9_mem - 0.25 h1i9_exists + h2i0_mem - 0.25 h2i0_exists + h2i1_mem - 0.25 h2i1_exists + h2i2_mem - 0.25 h2i2_exists + h2i3_mem - 0.25 h2i3_exists + h2i4_mem - 0.25 h2i4_exists + h2i5_mem - 0.25 h2i5_exists + h2i6_mem - 0.25 h2i6_exists + h2i7_mem - 0.25 h2i7_exists + h2i8_mem - 0.25 h2i8_exists + h2i9_mem - 0.25 h2i9_exists + h3i0_mem - 0.25 h3i0_exists + h3i1_mem - 0.25 h3i1_exists + h3i2_mem - 0.25 h3i2_exists + h3i3_mem - 0.25 h3i3_exists + h3i4_mem - 0.25 h3i4_exists + h3i5_mem - 0.25 h3i5_exists + h3i6_mem - 0.25 h3i6_exists + h3i7_mem - 0.25 h3i7_exists + h3i8_mem - 0.25 h3i8_exists + h3i9_mem - 0.25 h3i9_exists + h4i0_mem - 0.25 h4i0_exists + h4i1_mem - 0.25 h4i1_exists + h4i2_mem - 0.25 h4i2_exists + h4i3_mem - 0.25 h4i3_exists + h4i4_mem - 0.25 h4i4_exists + h4i5_mem - 0.25 h4i5_exists + h4i6_mem - 0.25 h4i6_exists + h4i7_mem - 0.25 h4i7_exists + h4i8_mem - 0.25 h4i8_exists + h4i9_mem - 0.25 h4i9_exists + h5i0_mem - 0.25 h5i0_exists + h5i1_mem - 0.25 h5i1_exists + h5i2_mem - 0.25 h5i2_exists + h5i3_mem - 0.25 h5i3_exists + h5i4_mem - 0.25 h5i4_exists + h5i5_mem - 0.25 h5i5_exists + h5i6_mem - 0.25 h5i6_exists + h5i7_mem - 0.25 h5i7_exists + h5i8_mem - 0.25 h5i8_exists + h5i9_mem - 0.25 h5i9_exists >= 0
	average_hdd: h0i0_mem - 0.25 h0i0_exists + h0i1_mem - 0.25 h0i1_exists + h0i2_mem - 0.25 h0i2_exists + h0i3_mem - 0.25 h0i3_exists + h0i4_mem - 0.25 h0i4_exists + h0i5_mem - 0.25 h0i5_exists + h0i6_mem - 0.25 h0i6_exists + h0i7_mem - 0.25 h0i7_exists + h0i8_mem - 0.25 h0i8_exists + h0i9_mem - 0.25 h0i9_exists + h1i0_mem - 0.25 h1i0_exists + h1i1_mem - 0.25 h1i1_exists + h1i2_mem - 0.25 h1i2_exists + h1i3_mem - 0.25 h1i3_exists + h1i4_mem - 0.25 h1i4_exists + h1i5_mem - 0.25 h1i5_exists + h1i6_mem - 0.25 h1i6_exists + h1i7_mem - 0.25 h1i7_exists + h1i8_mem - 0.25 h1i8_exists + h1i9_mem - 0.25 h1i9_exists + h2i0_mem - 0.25 h2i0_exists + h2i1_mem - 0.25 h2i1_exists + h2i2_mem - 0.25 h2i2_exists + h2i3_mem - 0.25 h2i3_exists + h2i4_mem - 0.25 h2i4_exists + h2i5_mem - 0.25 h2i5_exists + h2i6_mem - 0.25 h2i6_exists + h2i7_mem - 0.25 h2i7_exists + h2i8_mem - 0.25 h2i8_exists + h2i9_mem - 0.25 h2i9_exists + h3i0_mem - 0.25 h3i0_exists + h3i1_mem - 0.25 h3i1_exists + h3i2_mem - 0.25 h3i2_exists + h3i3_mem - 0.25 h3i3_exists + h3i4_mem - 0.25 h3i4_exists + h3i5_mem - 0.25 h3i5_exists + h3i6_mem - 0.25 h3i6_exists + h3i7_mem - 0.25 h3i7_exists + h3i8_mem - 0.25 h3i8_exists + h3i9_mem - 0.25 h3i9_exists + h4i0_mem - 0.25 h4i0_exists + h4i1_mem - 0.25 h4i1_exists + h4i2_mem - 0.25 h4i2_exists + h4i3_mem - 0.25 h4i3_exists + h4i4_mem - 0.25 h4i4_exists + h4i5_mem - 0.25 h4i5_exists + h4i6_mem - 0.25 h4i6_exists + h4i7_mem - 0.25 h4i7_exists + h4i8_mem - 0.25 h4i8_exists + h4i9_mem - 0.25 h4i9_exists + h5i0_mem - 0.25 h5i0_exists + h5i1_mem - 0.25 h5i1_exists + h5i2_mem - 0.25 h5i2_exists + h5i3_mem - 0.25 h5i3_exists + h5i4_mem - 0.25 h5i4_exists + h5i5_mem - 0.25 h5i5_exists + h5i6_mem - 0.25 h5i6_exists + h5i7_mem - 0.25 h5i7_exists + h5i8_mem - 0.25 h5i8_exists + h5i9_mem - 0.25 h5i9_exists >= 0
	r0_h4i0_redundant: r0a0_to_h4i0 + r0a1_to_h4i0 + r0a2_to_h4i0 + r0a3_to_h4i0 <= 1
	r0_h4i1_redundant: r0a0_to_h4i1 + r0a1_to_h4i1 + r0a2_to_h4i1 + r0a3_to_h4i1 <= 1
	r0_h4i2_redundant: r0a0_to_h4i2 + r0a1_to_h4i2 + r0a2_to_h4i2 + r0a3_to_h4i2 <= 1
	r0_h4i3_redundant: r0a0_to_h4i3 + r0a1_to_h4i3 + r0a2_to_h4i3 + r0a3_to_h4i3 <= 1
	r0_h4i4_redundant: r0a0_to_h4i4 + r0a1_to_h4i4 + r0a2_to_h4i4 + r0a3_to_h4i4 <= 1
	r0_h4i5_redundant: r0a0_to_h4i5 + r0a1_to_h4i5 + r0a2_to_h4i5 + r0a3_to_h4i5 <= 1
	r0_h4i6_redundant: r0a0_to_h4i6 + r0a1_to_h4i6 + r0a2_to_h4i6 + r0a3_to_h4i6 <= 1
	r0_h4i7_redundant: r0a0_to_h4i7 + r0a1_to_h4i7 + r0a2_to_h4i7 + r0a3_to_h4i7 <= 1
	r0_h4i8_redundant: r0a0_to_h4i8 + r0a1_to_h4i8 + r0a2_to_h4i8 + r0a3_to_h4i8 <= 1
	r0_h4i9_redundant: r0a0_to_h4i9 + r0a1_to_h4i9 + r0a2_to_h4i9 + r0a3_to_h4i9 <= 1
	r0_h5i0_redundant: r0a0_to_h5i0 + r0a1_to_h5i0 + r0a2_to_h5i0 + r0a3_to_h5i0 <= 1
	r0_h5i1_redundant: r0a0_to_h5i1 + r0a1_to_h5i1 + r0a2_to_h5i1 + r0a3_to_h5i1 <= 1
	r0_h5i2_redundant: r0a0_to_h5i2 + r0a1_to_h5i2 + r0a2_to_h5i2 + r0a3_to_h5i2 <= 1
	r0_h5i3_redundant: r0a0_to_h5i3 + r0a1_to_h5i3 + r0a2_to_h5i3 + r0a3_to_h5i3 <= 1
	r0_h5i4_redundant: r0a0_to_h5i4 + r0a1_to_h5i4 + r0a2_to_h5i4 + r0a3_to_h5i4 <= 1
	r0_h5i5_redundant: r0a0_to_h5i5 + r0a1_to_h5i5 + r0a2_to_h5i5 + r0a3_to_h5i5 <= 1
	r0_h5i6_redundant: r0a0_to_h5i6 + r0a1_to_h5i6 + r0a2_to_h5i6 + r0a3_to_h5i6 <= 1
	r0_h5i7_redundant: r0a0_to_h5i7 + r0a1_to_h5i7 + r0a2_to_h5i7 + r0a3_to_h5i7 <= 1
	r0_h5i8_redundant: r0a0_to_h5i8 + r0a1_to_h5i8 + r0a2_to_h5i8 + r0a3_to_h5i8 <= 1
	r0_h5i9_redundant: r0a0_to_h5i9 + r0a1_to_h5i9 + r0a2_to_h5i9 + r0a3_to_h5i9 <= 1
	r1_h0i0_redundant: r1a0_to_h0i0 + r1a1_to_h0i0 + r1a2_to_h0i0 <= 1
	r1_h0i1_redundant: r1a0_to_h0i1 + r1a1_to_h0i1 + r1a2_to_h0i1 <= 1
	r1_h0i2_redundant: r1a0_to_h0i2 + r1a1_to_h0i2 + r1a2_to_h0i2 <= 1
	r1_h0i3_redundant: r1a0_to_h0i3 + r1a1_to_h0i3 + r1a2_to_h0i3 <= 1
	r1_h0i4_redundant: r1a0_to_h0i4 + r1a1_to_h0i4 + r1a2_to_h0i4 <= 1
	r1_h0i5_redundant: r1a0_to_h0i5 + r1a1_to_h0i5 + r1a2_to_h0i5 <= 1
	r1_h0i6_redundant: r1a0_to_h0i6 + r1a1_to_h0i6 + r1a2_to_h0i6 <= 1
	r1_h0i7_redundant: r1a0_to_h0i7 + r1a1_to_h0i7 + r1a2_to_h0i7 <= 1
	r1_h0i8_redundant: r1a0_to_h0i8 + r1a1_to_h0i8 + r1a2_to_h0i8 <= 1
	r1_h0i9_redundant: r1a0_to_h0i9 + r1a1_to_h0i9 + r1a2_to_h0i9 <= 1
	r1_h1i0_redundant: r1a0_to_h1i0 + r1a1_to_h1i0 + r1a2_to_h1i0 <= 1
	r1_h1i1_redundant: r1a0_to_h1i1 + r1a1_to_h1i1 + r1a2_to_h1i1 <= 1
	r1_h1i2_redundant: r1a0_to_h1i2 + r1a1_to_h1i2 + r1a2_to_h1i2 <= 1
	r1_h1i3_redundant: r1a0_to_h1i3 + r1a1_to_h1i3 + r1a2_to_h1i3 <= 1
	r1_h1i4_redundant: r1a0_to_h1i4 + r1a1_to_h1i4 + r1a2_to_h1i4 <= 1
	r1_h1i5_redundant: r1a0_to_h1i5 + r1a1_to_h1i5 + r1a2_to_h1i5 <= 1
	r1_h1i6_redundant: r1a0_to_h1i6 + r1a1_to_h1i6 + r1a2_to_h1i6 <= 1
	r1_h1i7_redundant: r1a0_to_h1i7 + r1a1_to_h1i7 + r1a2_to_h1i7 <= 1
	r1_h1i8_redundant: r1a0_to_h1i8 + r1a1_to_h1i8 + r1a2_to_h1i8 <= 1
	r1_h1i9_redundant: r1a0_to_h1i9 + r1a1_to_h1i9 + r1a2_to_h1i9 <= 1
	r1_h2i0_redundant: r1a0_to_h2i0 + r1a1_to_h2i0 + r1a2_to_h2i0 <= 1
	r1_h2i1_redundant: r1a0_to_h2i1 + r1a1_to_h2i1 + r1a2_to_h2i1 <= 1
	r1_h2i2_redundant: r1a0_to_h2i2 + r1a1_to_h2i2 + r1a2_to_h2i2 <= 1
	r1_h2i3_redundant: r1a0_to_h2i3 + r1a1_to_h2i3 + r1a2_to_h2i3 <= 1
	r1_h2i4_redundant: r1a0_to_h2i4 + r1a1_to_h2i4 + r1a2_to_h2i4 <= 1
	r1_h2i5_redundant: r1a0_to_h2i5 + r1a1_to_h2i5 + r1a2_to_h2i5 <= 1
	r1_h2i6_redundant: r1a0_to_h2i6 + r1a1_to_h2i6 + r1a2_to_h2i6 <= 1
	r1_h2i7_redundant: r1a0_to_h2i7 + r1a1_to_h2i7 + r1a2_to_h2i7 <= 1
	r1_h2i8_redundant: r1a0_to_h2i8 + r1a1_to_h2i8 + r1a2_to_h2i8 <= 1
	r1_h2i9_redundant: r1a0_to_h2i9 + r1a1_to_h2i9 + r1a2_to_h2i9 <= 1
	r1_h3i0_redundant: r1a0_to_h3i0 + r1a1_to_h3i0 + r1a2_to_h3i0 <= 1
	r1_h3i1_redundant: r1a0_to_h3i1 + r1a1_to_h3i1 + r1a2_to_h3i1 <= 1
	r1_h3i2_redundant: r1a0_to_h3i2 + r1a1_to_h3i2 + r1a2_to_h3i2 <= 1
	r1_h3i3_redundant: r1a0_to_h3i3 + r1a1_to_h3i3 + r1a2_to_h3i3 <= 1
	r1_h3i4_redundant: r1a0_to_h3i4 + r1a1_to_h3i4 + r1a2_to_h3i4 <= 1
	r1_h3i5_redundant: r1a0_to_h3i5 + r1a1_to_h3i5 + r1a2_to_h3i5 <= 1
	r1_h3i6_redundant: r1a0_to_h3i6 + r1a1_to_h3i6 + r1a2_to_h3i6 <= 1
	r1_h3i7_redundant: r1a0_to_h3i7 + r1a1_to_h3i7 + r1a2_to_h3i7 <= 1
	r1_h3i8_redundant: r1a0_to_h3i8 + r1a1_to_h3i8 + r1a2_to_h3i8 <= 1
	r1_h3i9_redundant: r1a0_to_h3i9 + r1a1_to_h3i9 + r1a2_to_h3i9 <= 1
	r1_h4i0_redundant: r1a0_to_h4i0 + r1a1_to_h4i0 + r1a2_to_h4i0 <= 1
	r1_h4i1_redundant: r1a0_to_h4i1 + r1a1_to_h4i1 + r1a2_to_h4i1 <= 1
	r1_h4i2_redundant: r1a0_to_h4i2 + r1a1_to_h4i2 + r1a2_to_h4i2 <= 1
	r1_h4i3_redundant: r1a0_to_h4i3 + r1a1_to_h4i3 + r1a2_to_h4i3 <= 1
	r1_h4i4_redundant: r1a0_to_h4i4 + r1a1_to_h4i4 + r1a2_to_h4i4 <= 1
	r1_h4i5_redundant: r1a0_to_h4i5 + r1a1_to_h4i5 + r1a2_to_h4i5 <= 1
	r1_h4i6_redundant: r1a0_to_h4i6 + r1a1_to_h4i6 + r1a2_to_h4i6 <= 1
	r1_h4i7_redundant: r1a0_to_h4i7 + r1a1_to_h4i7 + r1a2_to_h4i7 <= 1
	r1_h4i8_redundant: r1a0_to_h4i8 + r1a1_to_h4i8 + r1a2_to_h4i8 <= 1
	r1_h4i9_redundant: r1a0_to_h4i9 + r1a1_to_h4i9 + r1a2_to_h4i9 <= 1
	r1_h5i0_redundant: r1a0_to_h5i0 + r1a1_to_h5i0 + r1a2_to_h5i0 <= 1
	r1_h5i1_redundant: r1a0_to_h5i1 + r1a1_to_h5i1 + r1a2_to_h5i1 <= 1
	r1_h5i2_redundant: r1a0_to_h5i2 + r1a1_to_h5i2 + r1a2_to_h5i2 <= 1
	r1_h5i3_redundant: r1a0_to_h5i3 + r1a1_to_h5i3 + r1a2_to_h5i3 <= 1
	r1_h5i4_redundant: r1a0_to_h5i4 + r1a1_to_h5i4 + r1a2_to_h5i4 <= 1
	r1_h5i5_redundant: r1a0_to_h5i5 + r1a1_to_h5i5 + r1a2_to_h5i5 <= 1
	r1_h5i6_redundant: r1a0_to_h5i6 + r1a1_to_h5i6 + r1a2_to_h5i6 <= 1
	r1_h5i7_redundant: r1a0_to_h5i7 + r1a1_to_h5i7 + r1a2_to_h5i7 <= 1
	r1_h5i8_redundant: r1a0_to_h5i8 + r1a1_to_h5i8 + r1a2_to_h5i8 <= 1
	r1_h5i9_redundant: r1a0_to_h5i9 + r1a1_to_h5i9 + r1a2_to_h5i9 <= 1
	r2_h4i0_redundant: r4a0_to_h4i0 + r4a1_to_h4i0 + r4a2_to_h4i0 + r4a3_to_h4i0 <= 1
	r2_h4i1_redundant: r4a0_to_h4i1 + r4a1_to_h4i1 + r4a2_to_h4i1 + r4a3_to_h4i1 <= 1
	r2_h4i2_redundant: r4a0_to_h4i2 + r4a1_to_h4i2 + r4a2_to_h4i2 + r4a3_to_h4i2 <= 1
	r2_h4i3_redundant: r4a0_to_h4i3 + r4a1_to_h4i3 + r4a2_to_h4i3 + r4a3_to_h4i3 <= 1
	r2_h4i4_redundant: r4a0_to_h4i4 + r4a1_to_h4i4 + r4a2_to_h4i4 + r4a3_to_h4i4 <= 1
	r2_h4i5_redundant: r4a0_to_h4i5 + r4a1_to_h4i5 + r4a2_to_h4i5 + r4a3_to_h4i5 <= 1
	r2_h4i6_redundant: r4a0_to_h4i6 + r4a1_to_h4i6 + r4a2_to_h4i6 + r4a3_to_h4i6 <= 1
	r2_h4i7_redundant: r4a0_to_h4i7 + r4a1_to_h4i7 + r4a2_to_h4i7 + r4a3_to_h4i7 <= 1
	r2_h4i8_redundant: r4a0_to_h4i8 + r4a1_to_h4i8 + r4a2_to_h4i8 + r4a3_to_h4i8 <= 1
	r2_h4i9_redundant: r4a0_to_h4i9 + r4a1_to_h4i9 + r4a2_to_h4i9 + r4a3_to_h4i9 <= 1
	r2_h5i0_redundant: r4a0_to_h5i0 + r4a1_to_h5i0 + r4a2_to_h5i0 + r4a3_to_h5i0 <= 1
	r2_h5i1_redundant: r4a0_to_h5i1 + r4a1_to_h5i1 + r4a2_to_h5i1 + r4a3_to_h5i1 <= 1
	r2_h5i2_redundant: r4a0_to_h5i2 + r4a1_to_h5i2 + r4a2_to_h5i2 + r4a3_to_h5i2 <= 1
	r2_h5i3_redundant: r4a0_to_h5i3 + r4a1_to_h5i3 + r4a2_to_h5i3 + r4a3_to_h5i3 <= 1
	r2_h5i4_redundant: r4a0_to_h5i4 + r4a1_to_h5i4 + r4a2_to_h5i4 + r4a3_to_h5i4 <= 1
	r2_h5i5_redundant: r4a0_to_h5i5 + r4a1_to_h5i5 + r4a2_to_h5i5 + r4a3_to_h5i5 <= 1
	r2_h5i6_redundant: r4a0_to_h5i6 + r4a1_to_h5i6 + r4a2_to_h5i6 + r4a3_to_h5i6 <= 1
	r2_h5i7_redundant: r4a0_to_h5i7 + r4a1_to_h5i7 + r4a2_to_h5i7 + r4a3_to_h5i7 <= 1
	r2_h5i8_redundant: r4a0_to_h5i8 + r4a1_to_h5i8 + r4a2_to_h5i8 + r4a3_to_h5i8 <= 1
	r2_h5i9_redundant: r4a0_to_h5i9 + r4a1_to_h5i9 + r4a2_to_h5i9 + r4a3_to_h5i9 <= 1
	r3_h0i0_redundant: r6a0_to_h0i0 + r6a1_to_h0i0 + r6a2_to_h0i0 + r6a3_to_h0i0 <= 1
	r3_h0i1_redundant: r6a0_to_h0i1 + r6a1_to_h0i1 + r6a2_to_h0i1 + r6a3_to_h0i1 <= 1
	r3_h0i2_redundant: r6a0_to_h0i2 + r6a1_to_h0i2 + r6a2_to_h0i2 + r6a3_to_h0i2 <= 1
	r3_h0i3_redundant: r6a0_to_h0i3 + r6a1_to_h0i3 + r6a2_to_h0i3 + r6a3_to_h0i3 <= 1
	r3_h0i4_redundant: r6a0_to_h0i4 + r6a1_to_h0i4 + r6a2_to_h0i4 + r6a3_to_h0i4 <= 1
	r3_h0i5_redundant: r6a0_to_h0i5 + r6a1_to_h0i5 + r6a2_to_h0i5 + r6a3_to_h0i5 <= 1
	r3_h0i6_redundant: r6a0_to_h0i6 + r6a1_to_h0i6 + r6a2_to_h0i6 + r6a3_to_h0i6 <= 1
	r3_h0i7_redundant: r6a0_to_h0i7 + r6a1_to_h0i7 + r6a2_to_h0i7 + r6a3_to_h0i7 <= 1
	r3_h0i8_redundant: r6a0_to_h0i8 + r6a1_to_h0i8 + r6a2_to_h0i8 + r6a3_to_h0i8 <= 1
	r3_h0i9_redundant: r6a0_to_h0i9 + r6a1_to_h0i9 + r6a2_to_h0i9 + r6a3_to_h0i9 <= 1
	r3_h1i0_redundant: r6a0_to_h1i0 + r6a1_to_h1i0 + r6a2_to_h1i0 + r6a3_to_h1i0 <= 1
	r3_h1i1_redundant: r6a0_to_h1i1 + r6a1_to_h1i1 + r6a2_to_h1i1 + r6a3_to_h1i1 <= 1
	r3_h1i2_redundant: r6a0_to_h1i2 + r6a1_to_h1i2 + r6a2_to_h1i2 + r6a3_to_h1i2 <= 1
	r3_h1i3_redundant: r6a0_to_h1i3 + r6a1_to_h1i3 + r6a2_to_h1i3 + r6a3_to_h1i3 <= 1
	r3_h1i4_redundant: r6a0_to_h1i4 + r6a1_to_h1i4 + r6a2_to_h1i4 + r6a3_to_h1i4 <= 1
	r3_h1i5_redundant: r6a0_to_h1i5 + r6a1_to_h1i5 + r6a2_to_h1i5 + r6a3_to_h1i5 <= 1
	r3_h1i6_redundant: r6a0_to_h1i6 + r6a1_to_h1i6 + r6a2_to_h1i6 + r6a3_to_h1i6 <= 1
	r3_h1i7_redundant: r6a0_to_h1i7 + r6a1_to_h1i7 + r6a2_to_h1i7 + r6a3_to_h1i7 <= 1
	r3_h1i8_redundant: r6a0_to_h1i8 + r6a1_to_h1i8 + r6a2_to_h1i8 + r6a3_to_h1i8 <= 1
	r3_h1i9_redundant: r6a0_to_h1i9 + r6a1_to_h1i9 + r6a2_to_h1i9 + r6a3_to_h1i9 <= 1
	r3_h2i0_redundant: r6a0_to_h2i0 + r6a1_to_h2i0 + r6a2_to_h2i0 + r6a3_to_h2i0 <= 1
	r3_h2i1_redundant: r6a0_to_h2i1 + r6a1_to_h2i1 + r6a2_to_h2i1 + r6a3_to_h2i1 <= 1
	r3_h2i2_redundant: r6a0_to_h2i2 + r6a1_to_h2i2 + r6a2_to_h2i2 + r6a3_to_h2i2 <= 1
	r3_h2i3_redundant: r6a0_to_h2i3 + r6a1_to_h2i3 + r6a2_to_h2i3 + r6a3_to_h2i3 <= 1
	r3_h2i4_redundant: r6a0_to_h2i4 + r6a1_to_h2i4 + r6a2_to_h2i4 + r6a3_to_h2i4 <= 1
	r3_h2i5_redundant: r6a0_to_h2i5 + r6a1_to_h2i5 + r6a2_to_h2i5 + r6a3_to_h2i5 <= 1
	r3_h2i6_redundant: r6a0_to_h2i6 + r6a1_to_h2i6 + r6a2_to_h2i6 + r6a3_to_h2i6 <= 1
	r3_h2i7_redundant: r6a0_to_h2i7 + r6a1_to_h2i7 + r6a2_to_h2i7 + r6a3_to_h2i7 <= 1
	r3_h2i8_redundant: r6a0_to_h2i8 + r6a1_to_h2i8 + r6a2_to_h2i8 + r6a3_to_h2i8 <= 1
	r3_h2i9_redundant: r6a0_to_h2i9 + r6a1_to_h2i9 + r6a2_to_h2i9 + r6a3_to_h2i9 <= 1
	r3_h3i0_redundant: r6a0_to_h3i0 + r6a1_to_h3i0 + r6a2_to_h3i0 + r6a3_to_h3i0 <= 1
	r3_h3i1_redundant: r6a0_to_h3i1 + r6a1_to_h3i1 + r6a2_to_h3i1 + r6a3_to_h3i1 <= 1
	r3_h3i2_redundant: r6a0_to_h3i2 + r6a1_to_h3i2 + r6a2_to_h3i2 + r6a3_to_h3i2 <= 1
	r3_h3i3_redundant: r6a0_to_h3i3 + r6a1_to_h3i3 + r6a2_to_h3i3 + r6a3_to_h3i3 <= 1
	r3_h3i4_redundant: r6a0_to_h3i4 + r6a1_to_h3i4 + r6a2_to_h3i4 + r6a3_to_h3i4 <= 1
	r3_h3i5_redundant: r6a0_to_h3i5 + r6a1_to_h3i5 + r6a2_to_h3i5 + r6a3_to_h3i5 <= 1
	r3_h3i6_redundant: r6a0_to_h3i6 + r6a1_to_h3i6 + r6a2_to_h3i6 + r6a3_to_h3i6 <= 1
	r3_h3i7_redundant: r6a0_to_h3i7 + r6a1_to_h3i7 + r6a2_to_h3i7 + r6a3_to_h3i7 <= 1
	r3_h3i8_redundant: r6a0_to_h3i8 + r6a1_to_h3i8 + r6a2_to_h3i8 + r6a3_to_h3i8 <= 1
	r3_h3i9_redundant: r6a0_to_h3i9 + r6a1_to_h3i9 + r6a2_to_h3i9 + r6a3_to_h3i9 <= 1
	r3_h4i0_redundant: r6a0_to_h4i0 + r6a1_to_h4i0 + r6a2_to_h4i0 + r6a3_to_h4i0 <= 1
	r3_h4i1_redundant: r6a0_to_h4i1 + r6a1_to_h4i1 + r6a2_to_h4i1 + r6a3_to_h4i1 <= 1
	r3_h4i2_redundant: r6a0_to_h4i2 + r6a1_to_h4i2 + r6a2_to_h4i2 + r6a3_to_h4i2 <= 1
	r3_h4i3_redundant: r6a0_to_h4i3 + r6a1_to_h4i3 + r6a2_to_h4i3 + r6a3_to_h4i3 <= 1
	r3_h4i4_redundant: r6a0_to_h4i4 + r6a1_to_h4i4 + r6a2_to_h4i4 + r6a3_to_h4i4 <= 1
	r3_h4i5_redundant: r6a0_to_h4i5 + r6a1_to_h4i5 + r6a2_to_h4i5 + r6a3_to_h4i5 <= 1
	r3_h4i6_redundant: r6a0_to_h4i6 + r6a1_to_h4i6 + r6a2_to_h4i6 + r6a3_to_h4i6 <= 1
	r3_h4i7_redundant: r6a0_to_h4i7 + r6a1_to_h4i7 + r6a2_to_h4i7 + r6a3_to_h4i7 <= 1
	r3_h4i8_redundant: r6a0_to_h4i8 + r6a1_to_h4i8 + r6a2_to_h4i8 + r6a3_to_h4i8 <= 1
	r3_h4i9_redundant: r6a0_to_h4i9 + r6a1_to_h4i9 + r6a2_to_h4i9 + r6a3_to_h4i9 <= 1
	r3_h5i0_redundant: r6a0_to_h5i0 + r6a1_to_h5i0 + r6a2_to_h5i0 + r6a3_to_h5i0 <= 1
	r3_h5i1_redundant: r6a0_to_h5i1 + r6a1_to_h5i1 + r6a2_to_h5i1 + r6a3_to_h5i1 <= 1
	r3_h5i2_redundant: r6a0_to_h5i2 + r6a1_to_h5i2 + r6a2_to_h5i2 + r6a3_to_h5i2 <= 1
	r3_h5i3_redundant: r6a0_to_h5i3 + r6a1_to_h5i3 + r6a2_to_h5i3 + r6a3_to_h5i3 <= 1
	r3_h5i4_redundant: r6a0_to_h5i4 + r6a1_to_h5i4 + r6a2_to_h5i4 + r6a3_to_h5i4 <= 1
	r3_h5i5_redundant: r6a0_to_h5i5 + r6a1_to_h5i5 + r6a2_to_h5i5 + r6a3_to_h5i5 <= 1
	r3_h5i6_redundant: r6a0_to_h5i6 + r6a1_to_h5i6 + r6a2_to_h5i6 + r6a3_to_h5i6 <= 1
	r3_h5i7_redundant: r6a0_to_h5i7 + r6a1_to_h5i7 + r6a2_to_h5i7 + r6a3_to_h5i7 <= 1
	r3_h5i8_redundant: r6a0_to_h5i8 + r6a1_to_h5i8 + r6a2_to_h5i8 + r6a3_to_h5i8 <= 1
	r3_h5i9_redundant: r6a0_to_h5i9 + r6a1_to_h5i9 + r6a2_to_h5i9 + r6a3_to_h5i9 <= 1
	r4_h0i0_redundant: r7a0_to_h0i0 + r7a1_to_h0i0 + r7a2_to_h0i0 <= 1
	r4_h0i1_redundant: r7a0_to_h0i1 + r7a1_to_h0i1 + r7a2_to_h0i1 <= 1
	r4_h0i2_redundant: r7a0_to_h0i2 + r7a1_to_h0i2 + r7a2_to_h0i2 <= 1
	r4_h0i3_redundant: r7a0_to_h0i3 + r7a1_to_h0i3 + r7a2_to_h0i3 <= 1
	r4_h0i4_redundant: r7a0_to_h0i4 + r7a1_to_h0i4 + r7a2_to_h0i4 <= 1
	r4_h0i5_redundant: r7a0_to_h0i5 + r7a1_to_h0i5 + r7a2_to_h0i5 <= 1
	r4_h0i6_redundant: r7a0_to_h0i6 + r7a1_to_h0i6 + r7a2_to_h0i6 <= 1
	r4_h0i7_redundant: r7a0_to_h0i7 + r7a1_to_h0i7 + r7a2_to_h0i7 <= 1
	r4_h0i8_redundant: r7a0_to_h0i8 + r7a1_to_h0i8 + r7a2_to_h0i8 <= 1
	r4_h0i9_redundant: r7a0_to_h0i9 + r7a1_to_h0i9 + r7a2_to_h0i9 <= 1
	r4_h1i0_redundant: r7a0_to_h1i0 + r7a1_to_h1i0 + r7a2_to_h1i0 <= 1
	r4_h1i1_redundant: r7a0_to_h1i1 + r7a1_to_h1i1 + r7a2_to_h1i1 <= 1
	r4_h1i2_redundant: r7a0_to_h1i2 + r7a1_to_h1i2 + r7a2_to_h1i2 <= 1
	r4_h1i3_redundant: r7a0_to_h1i3 + r7a1_to_h1i3 + r7a2_to_h1i3 <= 1
	r4_h1i4_redundant: r7a0_to_h1i4 + r7a1_to_h1i4 + r7a2_to_h1i4 <= 1
	r4_h1i5_redundant: r7a0_to_h1i5 + r7a1_to_h1i5 + r7a2_to_h1i5 <= 1
	r4_h1i6_redundant: r7a0_to_h1i6 + r7a1_to_h1i6 + r7a2_to_h1i6 <= 1
	r4_h1i7_redundant: r7a0_to_h1i7 + r7a1_to_h1i7 + r7a2_to_h1i7 <= 1
	r4_h1i8_redundant: r7a0_to_h1i8 + r7a1_to_h1i8 + r7a2_to_h1i8 <= 1
	r4_h1i9_redundant: r7a0_to_h1i9 + r7a1_to_h1i9 + r7a2_to_h1i9 <= 1
	r4_h2i0_redundant: r7a0_to_h2i0 + r7a1_to_h2i0 + r7a2_to_h2i0 <= 1
	r4_h2i1_redundant: r7a0_to_h2i1 + r7a1_to_h2i1 + r7a2_to_h2i1 <= 1
	r4_h2i2_redundant: r7a0_to_h2i2 + r7a1_to_h2i2 + r7a2_to_h2i2 <= 1
	r4_h2i3_redundant: r7a0_to_h2i3 + r7a1_to_h2i3 + r7a2_to_h2i3 <= 1
	r4_h2i4_redundant: r7a0_to_h2i4 + r7a1_to_h2i4 + r7a2_to_h2i4 <= 1
	r4_h2i5_redundant: r7a0_to_h2i5 + r7a1_to_h2i5 + r7a2_to_h2i5 <= 1
	r4_h2i6_redundant: r7a0_to_h2i6 + r7a1_to_h2i6 + r7a2_to_h2i6 <= 1
	r4_h2i7_redundant: r7a0_to_h2i7 + r7a1_to_h2i7 + r7a2_to_h2i7 <= 1
	r4_h2i8_redundant: r7a0_to_h2i8 + r7a1_to_h2i8 + r7a2_to_h2i8 <= 1
	r4_h2i9_redundant: r7a0_to_h2i9 + r7a1_to_h2i9 + r7a2_to_h2i9 <= 1
	r4_h3i0_redundant: r7a0_to_h3i0 + r7a1_to_h3i0 + r7a2_to_h3i0 <= 1
	r4_h3i1_redundant: r7a0_to_h3i1 + r7a1_to_h3i1 + r7a2_to_h3i1 <= 1
	r4_h3i2_redundant: r7a0_to_h3i2 + r7a1_to_h3i2 + r7a2_to_h3i2 <= 1
	r4_h3i3_redundant: r7a0_to_h3i3 + r7a1_to_h3i3 + r7a2_to_h3i3 <= 1
	r4_h3i4_redundant: r7a0_to_h3i4 + r7a1_to_h3i4 + r7a2_to_h3i4 <= 1
	r4_h3i5_redundant: r7a0_to_h3i5 + r7a1_to_h3i5 + r7a2_to_h3i5 <= 1
	r4_h3i6_redundant: r7a0_to_h3i6 + r7a1_to_h3i6 + r7a2_to_h3i6 <= 1
	r4_h3i7_redundant: r7a0_to_h3i7 + r7a1_to_h3i7 + r7a2_to_h3i7 <= 1
	r4_h3i8_redundant: r7a0_to_h3i8 + r7a1_to_h3i8 + r7a2_to_h3i8 <= 1
	r4_h3i9_redundant: r7a0_to_h3i9 + r7a1_to_h3i9 + r7a2_to_h3i9 <= 1
	r4_h4i0_redundant: r7a0_to_h4i0 + r7a1_to_h4i0 + r7a2_to_h4i0 <= 1
	r4_h4i1_redundant: r7a0_to_h4i1 + r7a1_to_h4i1 + r7a2_to_h4i1 <= 1
	r4_h4i2_redundant: r7a0_to_h4i2 + r7a1_to_h4i2 + r7a2_to_h4i2 <= 1
	r4_h4i3_redundant: r7a0_to_h4i3 + r7a1_to_h4i3 + r7a2_to_h4i3 <= 1
	r4_h4i4_redundant: r7a0_to_h4i4 + r7a1_to_h4i4 + r7a2_to_h4i4 <= 1
	r4_h4i5_redundant: r7a0_to_h4i5 + r7a1_to_h4i5 + r7a2_to_h4i5 <= 1
	r4_h4i6_redundant: r7a0_to_h4i6 + r7a1_to_h4i6 + r7a2_to_h4i6 <= 1
	r4_h4i7_redundant: r7a0_to_h4i7 + r7a1_to_h4i7 + r7a2_to_h4i7 <= 1
	r4_h4i8_redundant: r7a0_to_h4i8 + r7a1_to_h4i8 + r7a2_to_h4i8 <= 1
	r4_h4i9_redundant: r7a0_to_h4i9 + r7a1_to_h4i9 + r7a2_to_h4i9 <= 1
	r4_h5i0_redundant: r7a0_to_h5i0 + r7a1_to_h5i0 + r7a2_to_h5i0 <= 1
	r4_h5i1_redundant: r7a0_to_h5i1 + r7a1_to_h5i1 + r7a2_to_h5i1 <= 1
	r4_h5i2_redundant: r7a0_to_h5i2 + r7a1_to_h5i2 + r7a2_to_h5i2 <= 1
	r4_h5i3_redundant: r7a0_to_h5i3 + r7a1_to_h5i3 + r7a2_to_h5i3 <= 1
	r4_h5i4_redundant: r7a0_to_h5i4 + r7a1_to_h5i4 + r7a2_to_h5i4 <= 1
	r4_h5i5_redundant: r7a0_to_h5i5 + r7a1_to_h5i5 + r7a2_to_h5i5 <= 1
	r4_h5i6_redundant: r7a0_to_h5i6 + r7a1_to_h5i6 + r7a2_to_h5i6 <= 1
	r4_h5i7_redundant: r7a0_to_h5i7 + r7a1_to_h5i7 + r7a2_to_h5i7 <= 1
	r4_h5i8_redundant: r7a0_to_h5i8 + r7a1_to_h5i8 + r7a2_to_h5i8 <= 1
	r4_h5i9_redundant: r7a0_to_h5i9 + r7a1_to_h5i9 + r7a2_to_h5i9 <= 1
	h0i1_after_h0i0: h0i0_exists - h0i1_exists >= 0
	h0i2_after_h0i1: h0i1_exists - h0i2_exists >= 0
	h0i3_after_h0i2: h0i2_exists - h0i3_exists >= 0
	h0i4_after_h0i3: h0i3_exists - h0i4_exists >= 0
	h0i5_after_h0i4: h0i4_exists - h0i5_exists >= 0
	h0i6_after_h0i5: h0i5_exists - h0i6_exists >= 0
	h0i7_after_h0i6: h0i6_exists - h0i7_exists >= 0
	h0i8_after_h0i7: h0i7_exists - h0i8_exists >= 0
	h0i9_after_h0i8: h0i8_exists - h0i9_exists >= 0
	h1i1_after_h1i0: h1i0_exists - h1i1_exists >= 0
	h1i2_after_h1i1: h1i1_exists - h1i2_exists >= 0
	h1i3_after_h1i2: h1i2_exists - h1i3_exists >= 0
	h1i4_after_h1i3: h1i3_exists - h1i4_exists >= 0
	h1i5_after_h1i4: h1i4_exists - h1i5_exists >= 0
	h1i6_after_h1i5: h1i5_exists - h1i6_exists >= 0
	h1i7_after_h1i6: h1i6_exists - h1i7_exists >= 0
	h1i8_after_h1i7: h1i7_exists - h1i8_exists >= 0
	h1i9_after_h1i8: h1i8_exists - h1i9_exists >= 0
	h2i1_after_h2i0: h2i0_exists - h2i1_exists >= 0
	h2i2_after_h2i1: h2i1_exists - h2i2_exists >= 0
	h2i3_after_h2i2: h2i2_exists - h2i3_exists >= 0
	h2i4_after_h2i3: h2i3_exists - h2i4_exists >= 0
	h2i5_after_h2i4: h2i4_exists - h2i5_exists >= 0
	h2i6_after_h2i5: h2i5_exists - h2i6_exists >= 0
	h2i7_after_h2i6: h2i6_exists - h2i7_exists >= 0
	h2i8_after_h2i7: h2i7_exists - h2i8_exists >= 0
	h2i9_after_h2i8: h2i8_exists - h2i9_exists >= 0
	h3i1_after_h3i0: h3i0_exists - h3i1_exists >= 0
	h3i2_after_h3i1: h3i1_exists - h3i2_exists >= 0
	h3i3_after_h3i2: h3i2_exists - h3i3_exists >= 0
	h3i4_after_h3i3: h3i3_exists - h3i4_exists >= 0
	h3i5_after_h3i4: h3i4_exists - h3i5_exists >= 0
	h3i6_after_h3i5: h3i5_exists - h3i6_exists >= 0
	h3i7_after_h3i6: h3i6_exists - h3i7_exists >= 0
	h3i8_after_h3i7: h3i7_exists - h3i8_exists >= 0
	h3i9_after_h3i8: h3i8_exists - h3i9_exists >= 0
	h4i1_after_h4i0: h4i0_exists - h4i1_exists >= 0
	h4i2_after_h4i1: h4i1_exists - h4i2_exists >= 0
	h4i3_after_h4i2: h4i2_exists - h4i3_exists >= 0
	h4i4_after_h4i3: h4i3_exists - h4i4_exists >= 0
	h4i5_after_h4i4: h4i4_exists - h4i5_exists >= 0
	h4i6_after_h4i5: h4i5_exists - h4i6_exists >= 0
	h4i7_after_h4i6: h4i6_exists - h4i7_exists >= 0
	h4i8_after_h4i7: h4i7_exists - h4i8_exists >= 0
	h4i9_after_h4i8: h4i8_exists - h4i9_exists >= 0
	h5i1_after_h5i0: h5i0_exists - h5i1_exists >= 0
	h5i2_after_h5i1: h5i1_exists - h5i2_exists >= 0
	h5i3_after_h5i2: h5i2_exists - h5i3_exists >= 0
	h5i4_after_h5i3: h5i3_exists - h5i4_exists >= 0
	h5i5_after_h5i4: h5i4_exists - h5i5_exists >= 0
	h5i6_after_h5i5: h5i5_exists - h5i6_exists >= 0
	h5i7_after_h5i6: h5i6_exists - h5i7_exists >= 0
	h5i8_after_h5i7: h5i7_exists - h5i8_exists >= 0
	h5i9_after_h5i8: h5i8_exists - h5i9_exists >= 0
Bounds
	0 <= h0i0_mem <= 1
	0 <= h0i0_hdd <= 1
	0 <= h0i1_mem <= 1
	0 <= h0i1_hdd <= 1
	0 <= h0i2_mem <= 1
	0 <= h0i2_hdd <= 1
	0 <= h0i3_mem <= 1
	0 <= h0i3_hdd <= 1
	0 <= h0i4_mem <= 1
	0 <= h0i4_hdd <= 1
	0 <= h0i5_mem <= 1
	0 <= h0i5_hdd <= 1
	0 <= h0i6_mem <= 1
	0 <= h0i6_hdd <= 1
	0 <= h0i7_mem <= 1
	0 <= h0i7_hdd <= 1
	0 <= h0i8_mem <= 1
	0 <= h0i8_hdd <= 1
	0 <= h0i9_mem <= 1
	0 <= h0i9_hdd <= 1
	0 <= h1i0_mem <= 1
	0 <= h1i0_hdd <= 1
	0 <= h1i1_mem <= 1
	0 <= h1i1_hdd <= 1
	0 <= h1i2_mem <= 1
	0 <= h1i2_hdd <= 1
	0 <= h1i3_mem <= 1
	0 <= h1i3_hdd <= 1
	0 <= h1i4_mem <= 1
	0 <= h1i4_hdd <= 1
	0 <= h1i5_mem <= 1
	0 <= h1i5_hdd <= 1
	0 <= h1i6_mem <= 1
	0 <= h1i6_hdd <= 1
	0 <= h1i7_mem <= 1
	0 <= h1i7_hdd <= 1
	0 <= h1i8_mem <= 1
	0 <= h1i8_hdd <= 1
	0 <= h1i9_mem <= 1
	0 <= h1i9_hdd <= 1
	0 <= h2i0_mem <= 1
	0 <= h2i0_hdd <= 1
	0 <= h2i1_mem <= 1
	0 <= h2i1_hdd <= 1
	0 <= h2i2_mem <= 1
	0 <= h2i2_hdd <= 1
	0 <= h2i3_mem <= 1
	0 <= h2i3_hdd <= 1
	0 <= h2i4_mem <= 1
	0 <= h2i4_hdd <= 1
	0 <= h2i5_mem <= 1
	0 <= h2i5_hdd <= 1
	0 <= h2i6_mem <= 1
	0 <= h2i6_hdd <= 1
	0 <= h2i7_mem <= 1
	0 <= h2i7_hdd <= 1
	0 <= h2i8_mem <= 1
	0 <= h2i8_hdd <= 1
	0 <= h2i9_mem <= 1
	0 <= h2i9_hdd <= 1
	0 <= h3i0_mem <= 1
	0 <= h3i0_hdd <= 1
	0 <= h3i1_mem <= 1
	0 <= h3i1_hdd <= 1
	0 <= h3i2_mem <= 1
	0 <= h3i2_hdd <= 1
	0 <= h3i3_mem <= 1
	0 <= h3i3_hdd <= 1
	0 <= h3i4_mem <= 1
	0 <= h3i4_hdd <= 1
	0 <= h3i5_mem <= 1
	0 <= h3i5_hdd <= 1
	0 <= h3i6_mem <= 1
	0 <= h3i6_hdd <= 1
	0 <= h3i7_mem <= 1
	0 <= h3i7_hdd <= 1
	0 <= h3i8_mem <= 1
	0 <= h3i8_hdd <= 1
	0 <= h3i9_mem <= 1
	0 <= h3i9_hdd <= 1
	0 <= h4i0_mem <= 1
	0 <= h4i0_hdd <= 1
	0 <= h4i1_mem <= 1
	0 <= h4i1_hdd <= 1
	0 <= h4i2_mem <= 1
	0 <= h4i2_hdd <= 1
	0 <= h4i3_mem <= 1
	0 <= h4i3_hdd <= 1
	0 <= h4i4_mem <= 1
	0 <= h4i4_hdd <= 1
	0 <= h4i5_mem <= 1
	0 <= h4i5_hdd <= 1
	0 <= h4i6_mem <= 1
	0 <= h4i6_hdd <= 1
	0 <= h4i7_mem <= 1
	0 <= h4i7_hdd <= 1
	0 <= h4i8_mem <= 1
	0 <= h4i8_hdd <= 1
	0 <= h4i9_mem <= 1
	0 <= h4i9_hdd <= 1
	0 <= h5i0_mem <= 1
	0 <= h5i0_hdd <= 1
	0 <= h5i1_mem <= 1
	0 <= h5i1_hdd <= 1
	0 <= h5i2_mem <= 1
	0 <= h5i2_hdd <= 1
	0 <= h5i3_mem <= 1
	0 <= h5i3_hdd <= 1
	0 <= h5i4_mem <= 1
	0 <= h5i4_hdd <= 1
	0 <= h5i5_mem <= 1
	0 <= h5i5_hdd <= 1
	0 <= h5i6_mem <= 1
	0 <= h5i6_hdd <= 1
	0 <= h5i7_mem <= 1
	0 <= h5i7_hdd <= 1
	0 <= h5i8_mem <= 1
	0 <= h5i8_hdd <= 1
	0 <= h5i9_mem <= 1
	0 <= h5i9_hdd <= 1
Binary
	h0i0_exists
	h0i1_exists
	h0i2_exists
	h0i3_exists
	h0i4_exists
	h0i5_exists
	h0i6_exists
	h0i7_exists
	h0i8_exists
	h0i9_exists
	h1i0_exists
	h1i1_exists
	h1i2_exists
	h1i3_exists
	h1i4_exists
	h1i5_exists
	h1i6_exists
	h1i7_exists
	h1i8_exists
	h1i9_exists
	h2i0_exists
	h2i1_exists
	h2i2_exists
	h2i3_exists
	h2i4_exists
	h2i5_exists
	h2i6_exists
	h2i7_exists
	h2i8_exists
	h2i9_exists
	h3i0_exists
	h3i1_exists
	h3i2_exists
	h3i3_exists
	h3i4_exists
	h3i5_exists
	h3i6_exists
	h3i7_exists
	h3i8_exists
	h3i9_exists
	h4i0_exists
	h4i1_exists
	h4i2_exists
	h4i3_exists
	h4i4_exists
	h4i5_exists
	h4i6_exists
	h4i7_exists
	h4i8_exists
	h4i9_exists
	h5i0_exists
	h5i1_exists
	h5i2_exists
	h5i3_exists
	h5i4_exists
	h5i5_exists
	h5i6_exists
	h5i7_exists
	h5i8_exists
	h5i9_exists
	r0a0_to_h4i0
	r0a0_to_h4i1
	r0a0_to_h4i2
	r0a0_to_h4i3
	r0a0_to_h4i4
	r0a0_to_h4i5
	r0a0_to_h4i6
	r0a0_to_h4i7
	r0a0_to_h4i8
	r0a0_to_h4i9
	r0a0_to_h5i0
	r0a0_to_h5i1
	r0a0_to_h5i2
	r0a0_to_h5i3
	r0a0_to_h5i4
	r0a0_to_h5i5
	r0a0_to_h5i6
	r0a0_to_h5i7
	r0a0_to_h5i8
	r0a0_to_h5i9
	r0a1_to_h4i0
	r0a1_to_h4i1
	r0a1_to_h4i2
	r0a1_to_h4i3
	r0a1_to_h4i4
	r0a1_to_h4i5
	r0a1_to_h4i6
	r0a1_to_h4i7
	r0a1_to_h4i8
	r0a1_to_h4i9
	r0a1_to_h5i0
	r0a1_to_h5i1
	r0a1_to_h5i2
	r0a1_to_h5i3
	r0a1_to_h5i4
	r0a1_to_h5i5
	r0a1_to_h5i6
	r0a1_to_h5i7
	r0a1_to_h5i8
	r0a1_to_h5i9
	r0a2_to_h4i0
	r0a2_to_h4i1
	r0a2_to_h4i2
	r0a2_to_h4i3
	r0a2_to_h4i4
	r0a2_to_h4i5
	r0a2_to_h4i6
	r0a2_to_h4i7
	r0a2_to_h4i8
	r0a2_to_h4i9
	r0a2_to_h5i0
	r0a2_to_h5i1
	r0a2_to_h5i2
	r0a2_to_h5i3
	r0a2_to_h5i4
	r0a2_to_h5i5
	r0a2_to_h5i6
	r0a2_to_h5i7
	r0a2_to_h5i8
	r0a2_to_h5i9
	r0a3_to_h4i0
	r0a3_to_h4i1
	r0a3_to_h4i2
	r0a3_to_h4i3
	r0a3_to_h4i4
	r0a3_to_h4i5
	r0a3_to_h4i6
	r0a3_to_h4i7
	r0a3_to_h4i8
	r0a3_to_h4i9
	r0a3_to_h5i0
	r0a3_to_h5i1
	r0a3_to_h5i2
	r0a3_to_h5i3
	r0a3_to_h5i4
	r0a3_to_h5i5
	r0a3_to_h5i6
	r0a3_to_h5i7
	r0a3_to_h5i8
	r0a3_to_h5i9
	r1a0_to_h0i0
	r1a0_to_h0i1
	r1a0_to_h0i2
	r1a0_to_h0i3
	r1a0_to_h0i4
	r1a0_to_h0i5
	r1a0_to_h0i6
	r1a0_to_h0i7
	r1a0_to_h0i8
	r1a0_to_h0i9
	r1a0_to_h1i0
	r1a0_to_h1i1
	r1a0_to_h1i2
	r1a0_to_h1i3
	r1a0_to_h1i4
	r1a0_to_h1i5
	r1a0_to_h1i6
	r1a0_to_h1i7
	r1a0_to_h1i8
	r1a0_to_h1i9
	r1a0_to_h2i0
	r1a0_to_h2i1
	r1a0_to_h2i2
	r1a0_to_h2i3
	r1a0_to_h2i4
	r1a0_to_h2i5
	r1a0_to_h2i6
	r1a0_to_h2i7
	r1a0_to_h2i8
	r1a0_to_h2i9
	r1a0_to_h3i0
	r1a0_to_h3i1
	r1a0_to_h3i2
	r1a0_to_h3i3
	r1a0_to_h3i4
	r1a0_to_h3i5
	r1a0_to_h3i6
	r1a0_to_h3i7
	r1a0_to_h3i8
	r1a0_to_h3i9
	r1a0_to_h4i0
	r1a0_to_h4i1
	r1a0_to_h4i2
	r1a0_to_h4i3
	r1a0_to_h4i4
	r1a0_to_h4i5
	r1a0_to_h4i6
	r1a0_to_h4i7
	r1a0_to_h4i8
	r1a0_to_h4i9
	r1a0_to_h5i0
	r1a0_to_h5i1
	r1a0_to_h5i2
	r1a0_to_h5i3
	r1a0_to_h5i4
	r1a0_to_h5i5
	r1a0_to_h5i6
	r1a0_to_h5i7
	r1a0_to_h5i8
	r1a0_to_h5i9
	r1a1_to_h0i0
	r1a1_to_h0i1
	r1a1_to_h0i2
	r1a1_to_h0i3
	r1a1_to_h0i4
	r1a1_to_h0i5
	r1a1_to_h0i6
	r1a1_to_h0i7
	r1a1_to_h0i8
	r1a1_to_h0i9
	r1a1_to_h1i0
	r1a1_to_h1i1
	r1a1_to_h1i2
	r1a1_to_h1i3
	r1a1_to_h1i4
	r1a1_to_h1i5
	r1a1_to_h1i6
	r1a1_to_h1i7
	r1a1_to_h1i8
	r1a1_to_h1i9
	r1a1_to_h2i0
	r1a1_to_h2i1
	r1a1_to_h2i2
	r1a1_to_h2i3
	r1a1_to_h2i4
	r1a1_to_h2i5
	r1a1_to_h2i6
	r1a1_to_h2i7
	r1a1_to_h2i8
	r1a1_to_h2i9
	r1a1_to_h3i0
	r1a1_to_h3i1
	r1a1_to_h3i2
	r1a1_to_h3i3
	r1a1_to_h3i4
	r1a1_to_h3i5
	r1a1_to_h3i6
	r1a1_to_h3i7
	r1a1_to_h3i8
	r1a1_to_h3i9
	r1a1_to_h4i0
	r1a1_to_h4i1
	r1a1_to_h4i2
	r1a1_to_h4i3
	r1a1_to_h4i4
	r1a1_to_h4i5
	r1a1_to_h4i6
	r1a1_to_h4i7
	r1a1_to_h4i8
	r1a1_to_h4i9
	r1a1_to_h5i0
	r1a1_to_h5i1
	r1a1_to_h5i2
	r1a1_to_h5i3
	r1a1_to_h5i4
	r1a1_to_h5i5
	r1a1_to_h5i6
	r1a1_to_h5i7
	r1a1_to_h5i8
	r1a1_to_h5i9
	r1a2_to_h0i0
	r1a2_to_h0i1
	r1a2_to_h0i2
	r1a2_to_h0i3
	r1a2_to_h0i4
	r1a2_to_h0i5
	r1a2_to_h0i6
	r1a2_to_h0i7
	r1a2_to_h0i8
	r1a2_to_h0i9
	r1a2_to_h1i0
	r1a2_to_h1i1
	r1a2_to_h1i2
	r1a2_to_h1i3
	r1a2_to_h1i4
	r1a2_to_h1i5
	r1a2_to_h1i6
	r1a2_to_h1i7
	r1a2_to_h1i8
	r1a2_to_h1i9
	r1a2_to_h2i0
	r1a2_to_h2i1
	r1a2_to_h2i2
	r1a2_to_h2i3
	r1a2_to_h2i4
	r1a2_to_h2i5
	r1a2_to_h2i6
	r1a2_to_h2i7
	r1a2_to_h2i8
	r1a2_to_h2i9
	r1a2_to_h3i0
	r1a2_to_h3i1
	r1a2_to_h3i2
	r1a2_to_h3i3
	r1a2_to_h3i4
	r1a2_to_h3i5
	r1a2_to_h3i6
	r1a2_to_h3i7
	r1a2_to_h3i8
	r1a2_to_h3i9
	r1a2_to_h4i0
	r1a2_to_h4i1
	r1a2_to_h4i2
	r1a2_to_h4i3
	r1a2_to_h4i4
	r1a2_to_h4i5
	r1a2_to_h4i6
	r1a2_to_h4i7
	r1a2_to_h4i8
	r1a2_to_h4i9
	r1a2_to_h5i0
	r1a2_to_h5i1
	r1a2_to_h5i2
	r1a2_to_h5i3
	r1a2_to_h5i4
	r1a2_to_h5i5
	r1a2_to_h5i6
	r1a2_to_h5i7
	r1a2_to_h5i8
	r1a2_to_h5i9
	r2a0_to_h0i0
	r2a0_to_h0i1
	r2a0_to_h0i2
	r2a0_to_h0i3
	r2a0_to_h0i4
	r2a0_to_h0i5
	r2a0_to_h0i6
	r2a0_to_h0i7
	r2a0_to_h0i8
	r2a0_to_h0i9
	r2a0_to_h1i0
	r2a0_to_h1i1
	r2a0_to_h1i2
	r2a0_to_h1i3
	r2a0_to_h1i4
	r2a0_to_h1i5
	r2a0_to_h1i6
	r2a0_to_h1i7
	r2a0_to_h1i8
	r2a0_to_h1i9
	r2a0_to_h2i0
	r2a0_to_h2i1
	r2a0_to_h2i2
	r2a0_to_h2i3
	r2a0_to_h2i4
	r2a0_to_h2i5
	r2a0_to_h2i6
	r2a0_to_h2i7
	r2a0_to_h2i8
	r2a0_to_h2i9
	r2a0_to_h3i0
	r2a0_to_h3i1
	r2a0_to_h3i2
	r2a0_to_h3i3
	r2a0_to_h3i4
	r2a0_to_h3i5
	r2a0_to_h3i6
	r2a0_to_h3i7
	r2a0_to_h3i8
	r2a0_to_h3i9
	r2a0_to_h4i0
	r2a0_to_h4i1
	r2a0_to_h4i2
	r2a0_to_h4i3
	r2a0_to_h4i4
	r2a0_to_h4i5
	r2a0_to_h4i6
	r2a0_to_h4i7
	r2a0_to_h4i8
	r2a0_to_h4i9
	r2a0_to_h5i0
	r2a0_to_h5i1
	r2a0_to_h5i2
	r2a0_to_h5i3
	r2a0_to_h5i4
	r2a0_to_h5i5
	r2a0_to_h5i6
	r2a0_to_h5i7
	r2a0_to_h5i8
	r2a0_to_h5i9
	r3a0_to_h0i0
	r3a0_to_h0i1
	r3a0_to_h0i2
	r3a0_to_h0i3
	r3a0_to_h0i4
	r3a0_to_h0i5
	r3a0_to_h0i6
	r3a0_to_h0i7
	r3a0_to_h0i8
	r3a0_to_h0i9
	r3a0_to_h1i0
	r3a0_to_h1i1
	r3a0_to_h1i2
	r3a0_to_h1i3
	r3a0_to_h1i4
	r3a0_to_h1i5
	r3a0_to_h1i6
	r3a0_to_h1i7
	r3a0_to_h1i8
	r3a0_to_h1i9
	r3a0_to_h2i0
	r3a0_to_h2i1
	r3a0_to_h2i2
	r3a0_to_h2i3
	r3a0_to_h2i4
	r3a0_to_h2i5
	r3a0_to_h2i6
	r3a0_to_h2i7
	r3a0_to_h2i8
	r3a0_to_h2i9
	r3a0_to_h3i0
	r3a0_to_h3i1
	r3a0_to_h3i2
	r3a0_to_h3i3
	r3a0_to_h3i4
	r3a0_to_h3i5
	r3a0_to_h3i6
	r3a0_to_h3i7
	r3a0_to_h3i8
	r3a0_to_h3i9
	r3a0_to_h4i0
	r3a0_to_h4i1
	r3a0_to_h4i2
	r3a0_to_h4i3
	r3a0_to_h4i4
	r3a0_to_h4i5
	r3a0_to_h4i6
	r3a0_to_h4i7
	r3a0_to_h4i8
	r3a0_to_h4i9
	r3a0_to_h5i0
	r3a0_to_h5i1
	r3a0_to_h5i2
	r3a0_to_h5i3
	r3a0_to_h5i4
	r3a0_to_h5i5
	r3a0_to_h5i6
	r3a0_to_h5i7
	r3a0_to_h5i8
	r3a0_to_h5i9
	r4a0_to_h4i0
	r4a0_to_h4i1
	r4a0_to_h4i2
	r4a0_to_h4i3
	r4a0_to_h4i4
	r4a0_to_h4i5
	r4a0_to_h4i6
	r4a0_to_h4i7
	r4a0_to_h4i8
	r4a0_to_h4i9
	r4a0_to_h5i0
	r4a0_to_h5i1
	r4a0_to_h5i2
	r4a0_to_h5i3
	r4a0_to_h5i4
	r4a0_to_h5i5
	r4a0_to_h5i6
	r4a0_to_h5i7
	r4a0_to_h5i8
	r4a0_to_h5i9
	r4a1_to_h4i0
	r4a1_to_h4i1
	r4a1_to_h4i2
	r4a1_to_h4i3
	r4a1_to_h4i4
	r4a1_to_h4i5
	r4a1_to_h4i6
	r4a1_to_h4i7
	r4a1_to_h4i8
	r4a1_to_h4i9
	r4a1_to_h5i0
	r4a1_to_h5i1
	r4a1_to_h5i2
	r4a1_to_h5i3
	r4a1_to_h5i4
	r4a1_to_h5i5
	r4a1_to_h5i6
	r4a1_to_h5i7
	r4a1_to_h5i8
	r4a1_to_h5i9
	r4a2_to_h4i0
	r4a2_to_h4i1
	r4a2_to_h4i2
	r4a2_to_h4i3
	r4a2_to_h4i4
	r4a2_to_h4i5
	r4a2_to_h4i6
	r4a2_to_h4i7
	r4a2_to_h4i8
	r4a2_to_h4i9
	r4a2_to_h5i0
	r4a2_to_h5i1
	r4a2_to_h5i2
	r4a2_to_h5i3
	r4a2_to_h5i4
	r4a2_to_h5i5
	r4a2_to_h5i6
	r4a2_to_h5i7
	r4a2_to_h5i8
	r4a2_to_h5i9
	r4a3_to_h4i0
	r4a3_to_h4i1
	r4a3_to_h4i2
	r4a3_to_h4i3
	r4a3_to_h4i4
	r4a3_to_h4i5
	r4a3_to_h4i6
	r4a3_to_h4i7
	r4a3_to_h4i8
	r4a3_to_h4i9
	r4a3_to_h5i0
	r4a3_to_h5i1
	r4a3_to_h5i2
	r4a3_to_h5i3
	r4a3_to_h5i4
	r4a3_to_h5i5
	r4a3_to_h5i6
	r4a3_to_h5i7
	r4a3_to_h5i8
	r4a3_to_h5i9
	r5a0_to_h0i0
	r5a0_to_h0i1
	r5a0_to_h0i2
	r5a0_to_h0i3
	r5a0_to_h0i4
	r5a0_to_h0i5
	r5a0_to_h0i6
	r5a0_to_h0i7
	r5a0_to_h0i8
	r5a0_to_h0i9
	r5a0_to_h1i0
	r5a0_to_h1i1
	r5a0_to_h1i2
	r5a0_to_h1i3
	r5a0_to_h1i4
	r5a0_to_h1i5
	r5a0_to_h1i6
	r5a0_to_h1i7
	r5a0_to_h1i8
	r5a0_to_h1i9
	r5a0_to_h2i0
	r5a0_to_h2i1
	r5a0_to_h2i2
	r5a0_to_h2i3
	r5a0_to_h2i4
	r5a0_to_h2i5
	r5a0_to_h2i6
	r5a0_to_h2i7
	r5a0_to_h2i8
	r5a0_to_h2i9
	r5a0_to_h3i0
	r5a0_to_h3i1
	r5a0_to_h3i2
	r5a0_to_h3i3
	r5a0_to_h3i4
	r5a0_to_h3i5
	r5a0_to_h3i6
	r5a0_to_h3i7
	r5a0_to_h3i8
	r5a0_to_h3i9
	r5a0_to_h4i0
	r5a0_to_h4i1
	r5a0_to_h4i2
	r5a0_to_h4i3
	r5a0_to_h4i4
	r5a0_to_h4i5
	r5a0_to_h4i6
	r5a0_to_h4i7
	r5a0_to_h4i8
	r5a0_to_h4i9
	r5a0_to_h5i0
	r5a0_to_h5i1
	r5a0_to_h5i2
	r5a0_to_h5i3
	r5a0_to_h5i4
	r5a0_to_h5i5
	r5a0_to_h5i6
	r5a0_to_h5i7
	r5a0_to_h5i8
	r5a0_to_h5i9
	r6a0_to_h0i0
	r6a0_to_h0i1
	r6a0_to_h0i2
	r6a0_to_h0i3
	r6a0_to_h0i4
	r6a0_to_h0i5
	r6a0_to_h0i6
	r6a0_to_h0i7
	r6a0_to_h0i8
	r6a0_to_h0i9
	r6a0_to_h1i0
	r6a0_to_h1i1
	r6a0_to_h1i2
	r6a0_to_h1i3
	r6a0_to_h1i4
	r6a0_to_h1i5
	r6a0_to_h1i6
	r6a0_to_h1i7
	r6a0_to_h1i8
	r6a0_to_h1i9
	r6a0_to_h2i0
	r6a0_to_h2i1
	r6a0_to_h2i2
	r6a0_to_h2i3
	r6a0_to_h2i4
	r6a0_to_h2i5
	r6a0_to_h2i6
	r6a0_to_h2i7
	r6a0_to_h2i8
	r6a0_to_h2i9
	r6a0_to_h3i0
	r6a0_to_h3i1
	r6a0_to_h3i2
	r6a0_to_h3i3
	r6a0_to_h3i4
	r6a0_to_h3i5
	r6a0_to_h3i6
	r6a0_to_h3i7
	r6a0_to_h3i8
	r6a0_to_h3i9
	r6a0_to_h4i0
	r6a0_to_h4i1
	r6a0_to_h4i2
	r6a0_to_h4i3
	r6a0_to_h4i4
	r6a0_to_h4i5
	r6a0_to_h4i6
	r6a0_to_h4i7
	r6a0_to_h4i8
	r6a0_to_h4i9
	r6a0_to_h5i0
	r6a0_to_h5i1
	r6a0_to_h5i2
	r6a0_to_h5i3
	r6a0_to_h5i4
	r6a0_to_h5i5
	r6a0_to_h5i6
	r6a0_to_h5i7
	r6a0_to_h5i8
	r6a0_to_h5i9
	r6a1_to_h0i0
	r6a1_to_h0i1
	r6a1_to_h0i2
	r6a1_to_h0i3
	r6a1_to_h0i4
	r6a1_to_h0i5
	r6a1_to_h0i6
	r6a1_to_h0i7
	r6a1_to_h0i8
	r6a1_to_h0i9
	r6a1_to_h1i0
	r6a1_to_h1i1
	r6a1_to_h1i2
	r6a1_to_h1i3
	r6a1_to_h1i4
	r6a1_to_h1i5
	r6a1_to_h1i6
	r6a1_to_h1i7
	r6a1_to_h1i8
	r6a1_to_h1i9
	r6a1_to_h2i0
	r6a1_to_h2i1
	r6a1_to_h2i2
	r6a1_to_h2i3
	r6a1_to_h2i4
	r6a1_to_h2i5
	r6a1_to_h2i6
	r6a1_to_h2i7
	r6a1_to_h2i8
	r6a1_to_h2i9
	r6a1_to_h3i0
	r6a1_to_h3i1
	r6a1_to_h3i2
	r6a1_to_h3i3
	r6a1_to_h3i4
	r6a1_to_h3i5
	r6a1_to_h3i6
	r6a1_to_h3i7
	r6a1_to_h3i8
	r6a1_to_h3i9
	r6a1_to_h4i0
	r6a1_to_h4i1
	r6a1_to_h4i2
	r6a1_to_h4i3
	r6a1_to_h4i4
	r6a1_to_h4i5
	r6a1_to_h4i6
	r6a1_to_h4i7
	r6a1_to_h4i8
	r6a1_to_h4i9
	r6a1_to_h5i0
	r6a1_to_h5i1
	r6a1_to_h5i2
	r6a1_to_h5i3
	r6a1_to_h5i4
	r6a1_to_h5i5
	r6a1_to_h5i6
	r6a1_to_h5i7
	r6a1_to_h5i8
	r6a1_to_h5i9
	r6a2_to_h0i0
	r6a2_to_h0i1
	r6a2_to_h0i2
	r6a2_to_h0i3
	r6a2_to_h0i4
	r6a2_to_h0i5
	r6a2_to_h0i6
	r6a2_to_h0i7
	r6a2_to_h0i8
	r6a2_to_h0i9
	r6a2_to_h1i0
	r6a2_to_h1i1
	r6a2_to_h1i2
	r6a2_to_h1i3
	r6a2_to_h1i4
	r6a2_to_h1i5
	r6a2_to_h1i6
	r6a2_to_h1i7
	r6a2_to_h1i8
	r6a2_to_h1i9
	r6a2_to_h2i0
	r6a2_to_h2i1
	r6a2_to_h2i2
	r6a2_to_h2i3
	r6a2_to_h2i4
	r6a2_to_h2i5
	r6a2_to_h2i6
	r6a2_to_h2i7
	r6a2_to_h2i8
	r6a2_to_h2i9
	r6a2_to_h3i0
	r6a2_to_h3i1
	r6a2_to_h3i2
	r6a2_to_h3i3
	r6a2_to_h3i4
	r6a2_to_h3i5
	r6a2_to_h3i6
	r6a2_to_h3i7
	r6a2_to_h3i8
	r6a2_to_h3i9
	r6a2_to_h4i0
	r6a2_to_h4i1
	r6a2_to_h4i2
	r6a2_to_h4i3
	r6a2_to_h4i4
	r6a2_to_h4i5
	r6a2_to_h4i6
	r6a2_to_h4i7
	r6a2_to_h4i8
	r6a2_to_h4i9
	r6a2_to_h5i0
	r6a2_to_h5i1
	r6a2_to_h5i2
	r6a2_to_h5i3
	r6a2_to_h5i4
	r6a2_to_h5i5
	r6a2_to_h5i6
	r6a2_to_h5i7
	r6a2_to_h5i8
	r6a2_to_h5i9
	r6a3_to_h0i0
	r6a3_to_h0i1
	r6a3_to_h0i2
	r6a3_to_h0i3
	r6a3_to_h0i4
	r6a3_to_h0i5
	r6a3_to_h0i6
	r6a3_to_h0i7
	r6a3_to_h0i8
	r6a3_to_h0i9
	r6a3_to_h1i0
	r6a3_to_h1i1
	r6a3_to_h1i2
	r6a3_to_h1i3
	r6a3_to_h1i4
	r6a3_to_h1i5
	r6a3_to_h1i6
	r6a3_to_h1i7
	r6a3_to_h1i8
	r6a3_to_h1i9
	r6a3_to_h2i0
	r6a3_to_h2i1
	r6a3_to_h2i2
	r6a3_to_h2i3
	r6a3_to_h2i4
	r6a3_to_h2i5
	r6a3_to_h2i6
	r6a3_to_h2i7
	r6a3_to_h2i8
	r6a3_to_h2i9
	r6a3_to_h3i0
	r6a3_to_h3i1
	r6a3_to_h3i2
	r6a3_to_h3i3
	r6a3_to_h3i4
	r6a3_to_h3i5
	r6a3_to_h3i6
	r6a3_to_h3i7
	r6a3_to_h3i8
	r6a3_to_h3i9
	r6a3_to_h4i0
	r6a3_to_h4i1
	r6a3_to_h4i2
	r6a3_to_h4i3
	r6a3_to_h4i4
	r6a3_to_h4i5
	r6a3_to_h4i6
	r6a3_to_h4i7
	r6a3_to_h4i8
	r6a3_to_h4i9
	r6a3_to_h5i0
	r6a3_to_h5i1
	r6a3_to_h5i2
	r6a3_to_h5i3
	r6a3_to_h5i4
	r6a3_to_h5i5
	r6a3_to_h5i6
	r6a3_to_h5i7
	r6a3_to_h5i8
	r6a3_to_h5i9
	r7a0_to_h0i0
	r7a0_to_h0i1
	r7a0_to_h0i2
	r7a0_to_h0i3
	r7a0_to_h0i4
	r7a0_to_h0i5
	r7a0_to_h0i6
	r7a0_to_h0i7
	r7a0_to_h0i8
	r7a0_to_h0i9
	r7a0_to_h1i0
	r7a0_to_h1i1
	r7a0_to_h1i2
	r7a0_to_h1i3
	r7a0_to_h1i4
	r7a0_to_h1i5
	r7a0_to_h1i6
	r7a0_to_h1i7
	r7a0_to_h1i8
	r7a0_to_h1i9
	r7a0_to_h2i0
	r7a0_to_h2i1
	r7a0_to_h2i2
	r7a0_to_h2i3
	r7a0_to_h2i4
	r7a0_to_h2i5
	r7a0_to_h2i6
	r7a0_to_h2i7
	r7a0_to_h2i8
	r7a0_to_h2i9
	r7a0_to_h3i0
	r7a0_to_h3i1
	r7a0_to_h3i2
	r7a0_to_h3i3
	r7a0_to_h3i4
	r7a0_to_h3i5
	r7a0_to_h3i6
	r7a0_to_h3i7
	r7a0_to_h3i8
	r7a0_to_h3i9
	r7a0_to_h4i0
	r7a0_to_h4i1
	r7a0_to_h4i2
	r7a0_to_h4i3
	r7a0_to_h4i4
	r7a0_to_h4i5
	r7a0_to_h4i6
	r7a0_to_h4i7
	r7a0_to_h4i8
	r7a0_to_h4i9
	r7a0_to_h5i0
	r7a0_to_h5i1
	r7a0_to_h5i2
	r7a0_to_h5i3
	r7a0_to_h5i4
	r7a0_to_h5i5
	r7a0_to_h5i6
	r7a0_to_h5i7
	r7a0_to_h5i8
	r7a0_to_h5i9
	r7a1_to_h0i0
	r7a1_to_h0i1
	r7a1_to_h0i2
	r7a1_to_h0i3
	r7a1_to_h0i4
	r7a1_to_h0i5
	r7a1_to_h0i6
	r7a1_to_h0i7
	r7a1_to_h0i8
	r7a1_to_h0i9
	r7a1_to_h1i0
	r7a1_to_h1i1
	r7a1_to_h1i2
	r7a1_to_h1i3
	r7a1_to_h1i4
	r7a1_to_h1i5
	r7a1_to_h1i6
	r7a1_to_h1i7
	r7a1_to_h1i8
	r7a1_to_h1i9
	r7a1_to_h2i0
	r7a1_to_h2i1
	r7a1_to_h2i2
	r7a1_to_h2i3
	r7a1_to_h2i4
	r7a1_to_h2i5
	r7a1_to_h2i6
	r7a1_to_h2i7
	r7a1_to_h2i8
	r7a1_to_h2i9
	r7a1_to_h3i0
	r7a1_to_h3i1
	r7a1_to_h3i2
	r7a1_to_h3i3
	r7a1_to_h3i4
	r7a1_to_h3i5
	r7a1_to_h3i6
	r7a1_to_h3i7
	r7a1_to_h3i8
	r7a1_to_h3i9
	r7a1_to_h4i0
	r7a1_to_h4i1
	r7a1_to_h4i2
	r7a1_to_h4i3
	r7a1_to_h4i4
	r7a1_to_h4i5
	r7a1_to_h4i6
	r7a1_to_h4i7
	r7a1_to_h4i8
	r7a1_to_h4i9
	r7a1_to_h5i0
	r7a1_to_h5i1
	r7a1_to_h5i2
	r7a1_to_h5i3
	r7a1_to_h5i4
	r7a1_to_h5i5
	r7a1_to_h5i6
	r7a1_to_h5i7
	r7a1_to_h5i8
	r7a1_to_h5i9
	r7a2_to_h0i0
	r7a2_to_h0i1
	r7a2_to_h0i2
	r7a2_to_h0i3
	r7a2_to_h0i4
	r7a2_to_h0i5
	r7a2_to_h0i6
	r7a2_to_h0i7
	r7a2_to_h0i8
	r7a2_to_h0i9
	r7a2_to_h1i0
	r7a2_to_h1i1
	r7a2_to_h1i2
	r7a2_to_h1i3
	r7a2_to_h1i4
	r7a2_to_h1i5
	r7a2_to_h1i6
	r7a2_to_h1i7
	r7a2_to_h1i8
	r7a2_to_h1i9
	r7a2_to_h2i0
	r7a2_to_h2i1
	r7a2_to_h2i2
	r7a2_to_h2i3
	r7a2_to_h2i4
	r7a2_to_h2i5
	r7a2_to_h2i6
	r7a2_to_h2i7
	r7a2_to_h2i8
	r7a2_to_h2i9
	r7a2_to_h3i0
	r7a2_to_h3i1
	r7a2_to_h3i2
	r7a2_to_h3i3
	r7a2_to_h3i4
	r7a2_to_h3i5
	r7a2_to_h3i6
	r7a2_to_h3i7
	r7a2_to_h3i8
	r7a2_to_h3i9
	r7a2_to_h4i0
	r7a2_to_h4i1
	r7a2_to_h4i2
	r7a2_to_h4i3
	r7a2_to_h4i4
	r7a2_to_h4i5
	r7a2_to_h4i6
	r7a2_to_h4i7
	r7a2_to_h4i8
	r7a2_to_h4i9
	r7a2_to_h5i0
	r7a2_to_h5i1
	r7a2_to_h5i2
	r7a2_to_h5i3
	r7a2_to_h5i4
	r7a2_to_h5i5
	r7a2_to_h5i6
	r7a2_to_h5i7
	r7a2_to_h5i8
	r7a2_to_h5i9
End
