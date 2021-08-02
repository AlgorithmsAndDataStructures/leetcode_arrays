# Google | Onsite | Min operations to reduce number to 1
<p>Given a positive integer <code>n</code> and 3 operations on <code>n</code>:</p>
<ol>
  <li>n - 1</li>
  <li>n / 2 (if n is even)</li>
  <li>n / 3 (if n % 3 == 0)</li>
</ol>
<p>Find the minimum number of above operations to reduce <code>n</code> to 1.</p>
<p><strong>Example 1:</strong><p>
<pre>
<code>Input: n = 9
Output: 2
Explanation:
Step 1: 9 / 3 = 3
Step 2: 3 / 3 = 1</code>
</pre>
<p><strong>Example 2:</strong></p>
<pre><code>Input: n = 8
Output: 3
Explanation:
Step 1: 8 / 2 = 4
Step 2: 4 / 2 = 2
Step 3: 2 - 1 = 1
</code></pre>
<p><strong>Example 3:</strong></p>
<pre><code>Input: n = 28
Output: 4
</code></pre>
